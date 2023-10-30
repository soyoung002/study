package javaexp.a08_access.fruit;

import javaexp.a08_access.bev.Carrot;

public class Mellon {
	String taste = "달고 맛난 참외맛의 메론";
	
	protected String spec = "참외와 가까운 친척들 접근!!";
			
	private void callMellonInfo() {
		Mellon m = new Mellon();
		System.out.println("default"+m.taste);
		System.out.println("protected"+m.taste);
//		System.out.println(m.spec);
	}
	
	//상속관계 있는 클래스
	private void callMellonInfoInherit() {
		System.out.println("default"+taste);
		System.out.println("protected"+spec);
	}
	//상속 관계 없는 클래스
	public void callAppleInfo() {
	Apple a = new Apple();
		System.out.println(taste);
		System.out.println(spec);
		
		
		
	}
	
}
