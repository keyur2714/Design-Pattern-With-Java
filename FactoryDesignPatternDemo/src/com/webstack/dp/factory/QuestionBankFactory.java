package com.webstack.dp.factory;

import com.webstack.dp.service.QuestionBank;
import com.webstack.dp.service.impl.AngularExam;
import com.webstack.dp.service.impl.BigDataExam;
import com.webstack.dp.service.impl.JavaExam;

public class QuestionBankFactory {

	public static QuestionBank getQuestionInstance(String questionType) {
		if("angular".equalsIgnoreCase(questionType)) {
			return new AngularExam();
		}else if("java".equalsIgnoreCase(questionType)) {
			return new JavaExam();
		}else if("bigdata".equalsIgnoreCase(questionType)) {
			return new BigDataExam();
		}
		return null;
	}
	
}
