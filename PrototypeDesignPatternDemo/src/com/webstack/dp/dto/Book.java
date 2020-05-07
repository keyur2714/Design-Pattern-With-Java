package com.webstack.dp.dto;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	public Book(int bookId, String bookName, String author, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
