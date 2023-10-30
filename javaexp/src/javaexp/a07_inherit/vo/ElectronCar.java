package javaexp.a07_inherit.vo;

public class ElectronCar extends Car{
	
	public String kind = "전기 자동차"; 
	// 같은 필드에 다른 이름을 사용.
	// 클래스 하위에서 선언해서 호출하여야 한다.
	// 현재 클래스에 있는 멤버(구성요소)와 상위 클래스에 있는 내용을
	// 구분하기 위하여 super, this를 사용한다.
	public void startEngine(){
	   System.out.println(super.kind+"를 작동합니다");
	   System.out.println("자동차의 종류는 "+this.kind);
	   super.startEngine();
	   System.out.println("전기도 작동을 합니다!");
	}
}
