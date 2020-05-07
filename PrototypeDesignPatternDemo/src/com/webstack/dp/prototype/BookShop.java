package com.webstack.dp.prototype;


import java.util.ArrayList;
import java.util.List;

import com.webstack.dp.dto.Book;

public class BookShop implements Cloneable{

	private int shopId;
	private String shopName;
	private List<Book> books = new ArrayList<>();
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadBooks() {
		//This is from Database.
		for(int i=1;i<=10;i++) {
			Book book = new Book(i,"Book "+i,"Author "+i,1000+i);
			getBooks().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopId=" + shopId + ", shopName=" + shopName + ", books=" + books + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		//default it's shallow copy
		List<Book> tempBooks = new ArrayList<>();
		BookShop tempBookShop = new BookShop();
		tempBookShop.setShopId(this.shopId);
		tempBookShop.setShopName(this.shopName);
		for(Book b : this.getBooks()) {
			Book temp = new Book(b.getBookId(),b.getBookName(),b.getAuthor(),b.getPrice());
			tempBookShop.getBooks().add(temp);
		}
		
		return tempBookShop;
		//return super.clone();
	}
		
}
