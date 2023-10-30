package javaexp.a07_inherit.vo;

public class ScoccerPlayer extends Player{
	public void drivingBall() {
		System.out.println("축구 공을 몰다!");
	}
	//상속은 상위에 공통된 필드와 메서드(멤버)를 
	//접근제어자 범위 안의 현재 클래스에 사용 가능하다.
	public void runningWithBall() {
		System.out.println("축구선수가");
		running();		//상위클래스 메서드 사용
		drivingBall();	//현재 클래스 메서드 사용
	}
}
