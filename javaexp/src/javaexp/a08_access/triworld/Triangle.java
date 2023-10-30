package javaexp.a08_access.triworld;

import javaexp.a08_access.shapworld.Shape;

public class Triangle extends Shape {
	// 오버라이딩
	public void drawing() {
		super.drawing();
//		super.painting(); 접근제어자 default
		// 외부 패키지 접근 불가..
		
		// protected 이상일 때만 상속 + 외부패키지일때 접근 가능
		System.out.println("삼각형 도형 완성!!");
	}
}
