package com.webstack.dp.driver;

import java.sql.Connection;
import java.sql.DriverManager;

import com.webstack.dp.factory.QuestionBankFactory;
import com.webstack.dp.service.QuestionBank;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
//		QuestionBank question = new AngularExam();
//		System.out.println(question.getQuestion());
				
		
		System.out.println("Getting Angular Exam Object: ");
		QuestionBank angularExam = QuestionBankFactory.getQuestionInstance("angular");
		System.out.println(angularExam.getQuestion());
		
		System.out.println("Getting Java Exam Object: ");
		QuestionBank javaExam = QuestionBankFactory.getQuestionInstance("java");
		System.out.println(javaExam.getQuestion());
		
		System.out.println("Getting BigData Exam Object: ");
		QuestionBank bigdataExam = QuestionBankFactory.getQuestionInstance("bigdata");
		System.out.println(bigdataExam.getQuestion());
		
	}

}
