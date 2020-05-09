package com.webstack.dp.driver;

import com.webstack.dp.dto.DoubleCheckSingletonPattern;
import com.webstack.dp.dto.EnumSingleton;
import com.webstack.dp.dto.LazySingletonPattern;
import com.webstack.dp.dto.LazyThreadSafeSingleTone;
import com.webstack.dp.dto.Person;

public class TestDriver {
	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna...!");
		
		Person p1 = Person.getPersonInstance();
		p1.setFirstName("keyur");
		p1.setLastName("thakor");
		
				
		p1.getContact().setEmail("denishjava@gmail.com");
		System.out.println("Person 1 "+p1 + " Contact1 " + p1.getContact());
		
		Person p2 = Person.getPersonInstance();
		
		p2.setFirstName("denish");
		p2.getContact().setEmail("sachin@gmail.com");
		System.out.println("Person 2 "+p2 +" Contact1 " + p2.getContact());
		
		System.out.println("Person 1 "+p1 +" Contact1 " + p1.getContact());
		
		System.out.println("=============================Lazy Initializtion==================");
		System.out.println("This is Good For Single Thread Environment...!");
		LazySingletonPattern lazySingletonPattern = LazySingletonPattern.getInstance();
		System.out.println(lazySingletonPattern.hashCode());
		LazySingletonPattern lazySingletonPattern1 = LazySingletonPattern.getInstance();
		System.out.println(lazySingletonPattern1.hashCode());
		
		if(System.identityHashCode(lazySingletonPattern) == System.identityHashCode(lazySingletonPattern1)) {
			System.out.println("Hashcode is Same");
		}
		
		Runnable r2 = new Runnable(
				) {			
			@Override
			public void run() {			
				for(int i=1;i<=100000;i++) {
				LazySingletonPattern lazySingletonPattern2 = LazySingletonPattern.getInstance();
				if(lazySingletonPattern2.hashCode() != lazySingletonPattern.hashCode()) {
					System.out.println(lazySingletonPattern2.hashCode());
				}
				
/*				if(System.identityHashCode(lazySingletonPattern) == System.identityHashCode(lazySingletonPattern2)) {
					System.out.println("Hashcode is Same");
				}*/
			}
		}};
		Runnable r3 = ()->{
			for(int i=1;i<=100000;i++) {
				LazySingletonPattern lazySingletonPattern3 = LazySingletonPattern.getInstance();
				if(lazySingletonPattern3.hashCode() != lazySingletonPattern.hashCode()) {
					System.out.println(lazySingletonPattern3.hashCode());
				}
			}	
		};
		Thread t1 = new Thread(r2);
		t1.start();
		Thread t2 = new Thread(r3);		
		t2.start();
		
				
		System.out.println("=============================Lazy Initializtion with Synchronization==================");
		System.out.println("This is Good For Multi Threaded Environment but performance is not good...!");
		
		
		LazyThreadSafeSingleTone lazyThreadSafeSingleTone = LazyThreadSafeSingleTone.getInstance();
		System.out.println(lazyThreadSafeSingleTone.hashCode());
		LazyThreadSafeSingleTone lazyThreadSafeSingleTone1 = LazyThreadSafeSingleTone.getInstance();
		System.out.println(lazyThreadSafeSingleTone1.hashCode());
		
		System.out.println("=============================Lazy Initializtion with Double Checked==================");
		System.out.println("This is Good For Multi Threaded Environment also Good in Performance but best Approach prior to java 5...!");
		
		DoubleCheckSingletonPattern doubleCheckSingletonPattern = DoubleCheckSingletonPattern.getInstance();
		System.out.println(doubleCheckSingletonPattern.hashCode());
		DoubleCheckSingletonPattern doubleCheckSingletonPattern1 = DoubleCheckSingletonPattern.getInstance();
		System.out.println(doubleCheckSingletonPattern1.hashCode());
		
		System.out.println("=============================Enum Singleton Pattern==================");
		System.out.println("This is Good For Multi Threaded Environment also Good in Performance but best Approach after java 5...!");
		
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
		
		System.out.println(enumSingleton1.hashCode());
		System.out.println(enumSingleton2.hashCode());
		
		enumSingleton1.sayHello();
	}
}
