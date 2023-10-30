package javaexp.a08_access.story1.friendship;

public class Deer {
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		// System.out.println("private:"+wc.hiddenCloth);
		// 접근제어자 private는 같은 패키지 클래스에서 접근 불가능
		System.out.println("x(default):"+wc.hiddenDeer);
		// default는 같은 패키지에서 접근 가능..
	}
}
