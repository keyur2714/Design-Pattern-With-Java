package com.webstack.dto;

import com.webstack.dp.MyContainer;
import com.webstack.dp.MyIterator;

public class FriendsIteratorService implements MyContainer {

	private String[] friendNames = {"keyur","denish","vinit","hiren","ravi"};

	
	@Override
	public MyIterator getMyIterator() {
		return new FriendsIterator();
	}
	
	private class FriendsIterator implements MyIterator{
		
		int idx = 0;
		
		@Override
		public boolean hasNext() {
			if(idx < friendNames.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return friendNames[idx++];
			}
			return null;
		}

		
	}
	
}
