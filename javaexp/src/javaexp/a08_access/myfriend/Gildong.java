package javaexp.a08_access.myfriend;

 public class Gildong {	
	 
//	 public Gildong() {}
//	 같은 패키지에서만 공유하는 정보
	 private String privCustom="이상한 잠꼬대를 한다";	//필드
	 
	 String friendPlan = "여름에 제주도로 친구들과 여행 계획";
	 
	 public String pubAnnouce="구독자 100만 유튜버 달성^^~";
	 protected String msgMyFollower="안녕하세요! 내 팔로우에게는 상금 10만원을 드립니다";
	 
	 
 	//메서드
 	void goWeekMeeting() {
 		System.out.println("친구들과 주말에 모임을 할 것이다!");
 	}

 	//외부에서 호출하는 내용
 	//접근제어자 public 어디서나 호출이 가능(ex.다른패키지여도 호출 가능)
 	public void callGildongInfo() {
 		Gildong g = new Gildong();
 		System.out.println(g.privCustom);
 		System.out.println(g.friendPlan);
 		System.out.println(g.pubAnnouce);
 		System.out.println(g.msgMyFollower);
 		g.goWeekMeeting();
 	
 	} 
}
