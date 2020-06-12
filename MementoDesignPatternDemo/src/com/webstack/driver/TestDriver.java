package com.webstack.driver;

import com.webstack.dp.Article;
import com.webstack.dto.ArticleDTO;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		Article article = new Article(27, "Design Pattern", "All Design Pattern in JAVA");
		
		System.out.println("Original "+article);
		
		//Create Memento - something like copy Ctr + C
		ArticleDTO articleDTO = article.createMemento();
		
		article.setContent("Memento Design Pattern");
		
		System.out.println("After Changes "+article);
		
		//Revert Back to original - something like Ctr + Z
		article.restore(articleDTO);
		System.out.println("After Restrore "+article);
		
	}

}
