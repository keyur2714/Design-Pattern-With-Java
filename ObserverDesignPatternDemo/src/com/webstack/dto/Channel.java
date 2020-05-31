package com.webstack.dto;

import java.util.ArrayList;
import java.util.List;

import com.webstack.dp.Subject;

public class Channel implements Subject {
	private String name;
	private String title;
	private List<Subsriber> subsriberList = new ArrayList<>();

	public Channel(String name) {
		this.name = name;
	}

	public void subsribe(Subsriber subsriber) {
		this.subsriberList.add(subsriber);
	}

	public void unSubsribe(Subsriber subsriber) {
		this.subsriberList.remove(subsriber);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void uploadVideo(String title) {
		this.title = title;
		this.notifyObserver();
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Subsriber subsriber : subsriberList) {
			subsriber.updateObserver();
		}
	}
}
