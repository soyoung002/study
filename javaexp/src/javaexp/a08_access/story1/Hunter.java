package javaexp.a08_access.story1;

import javaexp.a08_access.story1.friendship.WoodCutter;

public class Hunter {
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private:"+wc.hiddenCloth);
//		private는 해당 클래스 내에서만 사용 가능 외부 클래스 접근 불가
//		System.out.println("x(default):"+wc.hiddenDeer);
//		default는 같은 패키지 클래스끼리만 접근이 가능
//		다른 패키지에 있는 클래스는 접근 불가능..
		
	}
}
