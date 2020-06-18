package com.webstack.driver;

import com.webstack.dp.MyIterator;
import com.webstack.dto.FriendsIteratorService;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		FriendsIteratorService friendsIteratorService = new FriendsIteratorService();
		
		for(MyIterator myIterator = friendsIteratorService.getMyIterator();myIterator.hasNext();) {
			String friendName = (String)myIterator.next();
			System.out.println(friendName);
		}
	}

}
