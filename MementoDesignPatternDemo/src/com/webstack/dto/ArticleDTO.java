package com.webstack.dto;
//Memento Class - Must be Immutable 
public final class ArticleDTO {
	private final long id;
	private final String title;
	private final String content;

	public ArticleDTO(long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

}
