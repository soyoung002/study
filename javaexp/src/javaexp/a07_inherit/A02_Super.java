package javaexp.a07_inherit;

import javaexp.a07_inherit.vo.ElectronCar;

public class A02_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 상속관계에 있어서 super
		1. 필드
			상위에서 선언된 필드를 그대로 사용할 수 있지만,
			재정의했을 때, 상위에 선언된 필드와 하위에 선언된
			필드를 구분할 때, super를 이용한다.(실무적 활용도는 낮은편)
			this.필드 : 현재 필드
			super.필드 : 상위 필드
		2. 생성자
			상속을 하는 순간, 반드시 상위에 선언된 생성자를 호출하여야한다.
			1) default 생성자
			2) 사용자정의 생성자
				- 매개변수가 있는 경우
				- 매개변수가 없는 경우
			
		3. 메서드
		    상위에 선언된 메서드와 구분을 위해서 사용
		 * */
		Child c1 =new Child();
		c1.show();
		ElectronCar el1 = new ElectronCar();
		el1.startEngine();
		
		EleProduct ep = new EleProduct();
		System.out.println(ep.kind);
		EleProduct2 ep2 = new EleProduct2();
//		EleProduct2 ep3 = new EleProduct2("호출"); 
//		매개변수가 맞는 생성자가 선언되어 있지 않기때문에 에러가 발생
		EleProduct3 ep3 = new EleProduct3();
		EleProduct4 el4 = new EleProduct4();
		
		
		Fruit01 f01 = new Fruit01();
		System.out.println("상위에 있는 필드 접근:"+f01.name);
	}
}
class Product{
	String kind="기본 물건";
}
class EleProduct extends Product{
	// public EleProduct() {} 컴파일하는 순간 호출된다.
}
class Product2{
	String kind="기본 물건";
}
class EleProduct2 extends Product2{
	public EleProduct2() {
		System.out.println("선언된 생성자 내용 호출!!");
	}
}
class EleProduct3 extends Product2{
	public EleProduct3() {
		// super() : default 상위클래스 생성자 호출..
		System.out.println("선언된 생성자 내용 호출!!(default생성자)");
	}
}
class Product4{
	Product4(){
		System.out.println("### 상위 클래스 생성자 호출!!");
	}
}
// EleProduct4 el4 = new EleProduct4();
class EleProduct4 extends Product4{
	public EleProduct4() {
		// ## 주의 반드시 상위 생성자에 있는 생성자를 호출하여야 한다.
		// default로는 super()
		System.out.println("### 선언된 생성자 내용 호출!!4");
	}
}

class Product5{
	//Product5(){}
	Product5(String name){
		System.out.println("##### 상위 클래스 생성자 호출!!:"+ name);
	}
}
class EleProduct5 extends Product5{
	public EleProduct5() {
		super("홍길동");
		// ## 주의 반드시 상위 생성자에 있는 생성자를 호출하여야 한다.
		// default로는 super()
		System.out.println("##### 선언된 생성자 내용 호출!!5");
	}
}
class Vehicle{
	String kind;
	Vehicle(String kind){
		this.kind = kind;
	}
}
class Car extends Vehicle{
	// public Car(){}
	Car(){
		super("자동차"); 
		// 상위에 있는 생성자를 반드시 호출하는 코드를 설정하여야 한다.
	}
}
// ex) Product01 클래스에 name으로 필드를 선언하고 초기화하는 생성자
//     선언하고, Fruit01 클래스로 과일이라는 문자열로 상위 생성자를
//     호출하여 처리해보세요..
class Product01{
	String name;
	Product01(String name){
		this.name = name;
	}
}
class Fruit01 extends Product01{
	Fruit01(){
		super("과일★★★");
	}
}

// ex) Car(kind, startEngine()), ElectronCar위 Car상속
//     super키를 활용해서 필드와 메서드를 상위/현재 클래스 호출해서 출력

class Parent{
	String name="부모님";
	void show() {
		System.out.println("부모 클래스의 메서드");
	}
}
class Child extends Parent{
	String name = "자식"; // 상위 클래스의 필드 재정의
	void show() {
		super.show(); // 같은 이름의 부모 클래스의 메서드 호출
		System.out.println("자식 클래스의 메서드");
		System.out.println("# 필드 #");
		System.out.println("현재 객체의 필드:"+this.name);
		System.out.println("부모 객체의 필드:"+super.name);
	}
}
