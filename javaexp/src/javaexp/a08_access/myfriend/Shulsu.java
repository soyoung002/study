package javaexp.a08_access.myfriend;

public class Shulsu {
	public void callGildongInfo() {
 		Gildong g = new Gildong();
// 		System.out.println(g.privCustom);
// 		private : 해당 클래스외에는 접근 불가
 		System.out.println(g.friendPlan);
 		g.goWeekMeeting();
 		System.out.println(g.pubAnnouce);
 		System.out.println(g.msgMyFollower);
	}
}