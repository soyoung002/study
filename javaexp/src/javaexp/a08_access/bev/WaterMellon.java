package javaexp.a08_access.bev;

import javaexp.a08_access.fruit.Mellon;

public class WaterMellon extends Mellon {

	//상속관계 없는 클래스에서
	private void callMellonInfo() {
		Mellon m = new Mellon();
//		System.out.println("default"+m.taste);
//		객체생성으로 호출하는 것으로 상속 개념으로 사용하는 것이 아니기에
//		접근 불가
//		System.out.println("protected"+m.spec);
		}
	//상속 관계 있는 클래스
	public void callAppleInfoInherit() {
//		System.out.println("default"+taste);
//		외부 패키지 + 상속하기 protected로 접근 가능
		System.out.println("protected"+spec);
		}
		
	}

	
