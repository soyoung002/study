package javaexp.a07_inherit.vo;

public class Car {
	public String kind = "자동차";
	public void startEngine() {
		System.out.println(kind);
		System.out.println("엔진을 작동합니다.");
	}
}
/*
# super는 클래스 안에서 현재 클래스와 상속해주는 상위 클래스와 멤버의 구분을
위하여 사용한다.
public class ElectronCar extends Car{
	public String kind = "전기 자동차"; 
	// 같은 필드에 다른 이름을 사용.
	public void startEngine(){
	   System.out.println(super.kind+"를 작동합니다");
	   System.out.println("자동차의 종류는 "+this.kind);
	   super.startEngine();
	   System.out.println("전기도 작동을 합니다!");
	}
	
}
 * 
 * */
