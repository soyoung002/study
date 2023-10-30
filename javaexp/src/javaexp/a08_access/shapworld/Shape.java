package javaexp.a08_access.shapworld;

public class Shape {
	
	void painting() { // 패키지가 동일할 때..
		System.out.println("색칠하다.");
	}
	protected void drawing() {// 상속 + 외부패키지 일때만
		System.out.println("도형을 그리다");
	}
	// public : 상속관계 없더라도 접근하여 호출 가능하다
	//
}
