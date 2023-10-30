package javaexp.a06_objectview.vo;

public class Book {
	//this : 현재 객체의 주소(참조값)
	public Book() {
		System.out.println("매개변수가 없는 생성자:"+this);
	}
	//Book b2 = new Book("자바시작도서"); 		==>main()에서호출
	public Book(String name) {
		System.out.println("매개변수1개 생성자:"+this);
		System.out.println("도서명"+name);
		
	}
	

}
