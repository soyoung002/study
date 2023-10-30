package javaexp.a08_access.unclefriend;

import javaexp.a08_access.myfriend.Gildong;

public class MyUcle {
	public void callGildonInfo() {
		Gildong g = null;	//public class Gildong
//								클래스 선언에 영향을 미침
		g = new Gildong();	//public Gildong() {}
//								생성자 선언에 영향을 미침
//		System.out.println(g.privCustom);
//		외부패키지에 있는 클래스에서 해당 구성요소가 접근이 불가능
//		System.out.println(g.friendPlan);
//		g.goWeekMeeting();
		System.out.println(g.pubAnnouce);
//		System.out.println(g.msgMyFollwer); 상속관계가 없어서 호출 불가
		g.callGildongInfo();
		
	}
}
