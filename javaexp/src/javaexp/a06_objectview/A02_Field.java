package javaexp.a06_objectview;

public class A02_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p01 = new Phone("홍길동","01012345678");
		System.out.println(p01.owner);
		System.out.println(p01.phoneNumber);
		Phone p02 = new Phone();
		p02.owner = "김길동"; p02.phoneNumber="01098765432";
		System.out.println(p02.owner);
		System.out.println(p02.phoneNumber);
		
		Car car = new Car("현대자동차","제네시스gv90",2022);
		System.out.println("제조사:"+car.name);
		System.out.println("모델:"+car.model);
		System.out.println("연식:"+car.year);
		//ex) Car클래스 필드 제조사, 모델, 연식
		//		매개변수 없는 생성자, 매개변수3개인 생성자 각각 선언하여 필드값을 출력
	}

}


/*
 # 필드 #
 1. 클래스 선언에서 객체가 생성되어서 사용할 메모리 저장 구조를 말한다.
 2. 주로 객체가 가지고 사용할 저장데이터를 이 클래스 안에서는 전역변수로 사용된다.
 3. 접근 제어자는 private로 주로 사용하여 외부에서 메서드(public)로 간접적으로 접근해서 사용한다.
 4. 생성자의 매개변수로 전달된 데이터로 이 필드를 초기화 하는 경우가 많다.
 * */
class Car{
	String name;
	String model;
	int year;
	public Car() {
	}
	public Car(String name, String model, int year) {
		this.name=name;
		this.model=model;
		this.year = year;
	}
}


class Phone{
	String owner;
	String phoneNumber;
	
	public Phone() {
		
	}
	public Phone(String owner, String phoneNumber) {
		this.owner = owner;
		this.phoneNumber = phoneNumber;
	}

	
}


