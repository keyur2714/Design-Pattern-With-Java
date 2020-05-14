package com.webstack.driver;

import com.webstack.dp.PenAdaptor;
import com.webstack.dto.AssignmentWork;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setPen(new PenAdaptor());
		assignmentWork.writeAssignments("Write Something on COVID19");
	}

}
