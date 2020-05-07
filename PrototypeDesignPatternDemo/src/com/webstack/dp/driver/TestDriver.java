package com.webstack.dp.driver;

import com.webstack.dp.prototype.BookShop;

public class TestDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		BookShop shop1 = new BookShop();
		shop1.setShopId(111);
		shop1.setShopName("ABC Book Shop");
		shop1.loadBooks();		
		System.out.println(shop1.toString());
		
/*		BookShop shop2 = new BookShop();
		shop2.setShopId(222);
		shop2.setShopName("XYZ Book Shop");
		shop2.loadBooks();		
		System.out.println(shop2.toString());*/
		
		BookShop shop2 = (BookShop) shop1.clone();
		
		shop2.setShopId(222);
		shop2.setShopName("XYZ Book Shop");
		
		//shop1.setShopId(999);
		shop1.getBooks().remove(2);
		
		System.out.println("After Remove From Shop 1: ");
		System.out.println(shop1.toString());
		
		System.out.println("Shop 2: ");
		System.out.println(shop2);
		
	}

}
