package javaexp.a08_access.bev;

import javaexp.a08_access.fruit.Apple;
import javaexp.a08_access.fruit.Mellon;

public class Carrot {
	
	public void callMellonInfo() {
		Mellon m = new Mellon();
//		System.out.println(m.taste);
	}
	public void callAppleInfo() {
		Apple a = new Apple();
//		System.out.println(a.tasteSec);
	}	
	private void callMellonInfo2() {
		Mellon m = new Mellon();
//		System.out.println(m.taste);
	}	
}
