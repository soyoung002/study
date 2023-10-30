package javaexp.a08_access.fruit;

public class KoMellon extends Mellon {// 상속관계 있는 클래스

	/*
	 * # 상속관계에 있는 같은 패키지에 있는 클래스에서는 default와 protected가 상관없이 처리된다.
	 */

//상속관계 없는 클래스에서
	private void callMellonInfo() {
		Mellon m = new Mellon();
		System.out.println("default:" + m.taste);
		System.out.println("protected:" + m.spec);
	}

// 상속관계가 있는 클래스에서
	private void callMellonInfoInherit() {
		System.out.println("default:" + taste);
		System.out.println("protected:" + spec);
	}
}
