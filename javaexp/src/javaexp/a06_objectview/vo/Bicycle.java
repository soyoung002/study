package javaexp.a06_objectview.vo;

public class Bicycle {

	public Bicycle() {	//매개변수 없는 생성자 생성자public Bicycle
						//() ==> 여기안에 매개변수가 들어가는데 없으므로 없는 생성자
//		Bicycle bc1 = new Bicycle();
		System.out.println("매개변수 생성자가 없음"+this);
	}
//		Bicycle bc2 = new Bicycle("삼천리");
	public Bicycle(String name) {
		System.out.println("매개변수1:"+this);
		System.out.println("제조사:"+name);
	}
//		Bicycle bc3 = new Bicycle("삼천리", 12000000);
	public Bicycle(String name, int price) {
		System.out.println("매개변수2:"+this);
		System.out.println("매개변수2:"+name+"가격:"+price);
}
	
}
