package javaexp.a08_access.unclefriend;

import javaexp.a08_access.myfriend.Gildong;

public class GildongFollwer extends Gildong {
//Gildong 상속관계에 있는 외부 패키지에서

	
	public void callGildongInfo() {
		//상속 관계에서 접근 멤버 확인
// 		System.out.println(privCustom); : 하나의 클래스만
// 		System.out.println(friendPlan); : default 접근제어자..deault 같은 패키지에 있을 때
//		goWeekMeeting();
		
//		상속 + protected 이기에 접근 가능
 		System.out.println(pubAnnouce);
// 		public은 상속 상관없이 접근 가능
 		System.out.println(msgMyFollower);
// 		Gildong g = new Gildong();	//객체를 호출하는 것...상속이므로 쓸 필요 없음
 	
	
	

}
	}
