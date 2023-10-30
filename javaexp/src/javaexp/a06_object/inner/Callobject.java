package javaexp.a06_object.inner;

import javaexp.a06_object.Book;

import javaexp.a06_object.Puppy;

//javaexp.a06_object.inner
//앞에 패키지명이 같더라도 모든 패키지가 다르면 다른 패키지이다.

public class Callobject {

	public static void main(String[] args) {
//		외부 패키지에 있는 클래스를 객체로 생성하려면..
//		1. import
//		2. 객체 생성해서
//		3. 해당 구성요소가 접근제어자가 public 이어야 함.
		
		Puppy p01 = new Puppy();
		// p01.kind는 접근제어자가 public이기에 호출이 안된다.
		p01.name="댕댕이2";
		
		
		Book b01 = new Book();
		b01.title = "오라클마스터";
		System.out.println(b01.title);
//		b1.price : 접근제어자 범위가 public이 아니기에 외부에서
//					직접적으로 호출해서 사용할 수 없다.
		
		//다른 패키지에 선언된 클래스를 객체로 사용하려면
		//1.import
		//2.class 앞에 접근 제어자가 public가 있어야함
		//다른 패키지에서 쓸때는 무조건 import + public 해줘야함.
		
//	Bady bab01; 같은 패키지가 아니므로 오류 이럴경우 import와 public 해ㅜ줘야함.
		
		
	}
}
