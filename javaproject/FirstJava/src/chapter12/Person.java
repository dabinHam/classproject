package chapter12;

import java.io.Serializable;
// 직렬화를 하기위하여 저장하는 클래스는 Serializable 인터페이스를 구현해야한다.
public class Person implements Serializable{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void tell() {
		System.out.println("안녕하세요 . "+ age + " 살"+name+"입니다.");
	}
	
	
	
	
}
