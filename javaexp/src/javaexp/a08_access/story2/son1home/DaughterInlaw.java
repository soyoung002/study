package javaexp.a08_access.story2.son1home;

import javaexp.a08_access.story2.woodcutterhome.WoodCutter;

public class DaughterInlaw {
	// 상속하지않는 일반클래스 호출
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		//System.out.println("private:"+wc.privSecurity);
		//System.out.println("default:"+wc.savingMoney);
		//System.out.println("protected:"+wc.inhiritance);
		System.out.println("public:"+wc.announce);
		// 상속하지 않는 외부 패키지의 클래스는 public으로만 접근이
		// 가능하다..
	}	
}
