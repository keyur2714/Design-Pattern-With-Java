package com.webstack.dp;

import com.webstack.dto.ArticleDTO;
//Originator Class
public class Article {

	private long id;
	private String title;
	private String content;

	public Article(long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArticleDTO createMemento() {
		ArticleDTO articleDTO = new ArticleDTO(id, title, content);
		return articleDTO;
	}

	public void restore(ArticleDTO articleDTO) {
		this.id = articleDTO.getId();
		this.title = articleDTO.getTitle();
		this.content = articleDTO.getContent();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

}
