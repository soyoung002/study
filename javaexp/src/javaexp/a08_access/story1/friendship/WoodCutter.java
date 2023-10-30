package javaexp.a08_access.story1.friendship;

public class WoodCutter {
	private String hiddenCloth="뒷동산 바위밑 깊은 곳에";
	String hiddenDeer = "덤불속에 사슴을 숨기다";
	
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		System.out.println("private:"+wc.hiddenCloth);
		System.out.println("x(default):"+wc.hiddenDeer);
	}
}
