package javaexp.a07_inherit;

import javaexp.a07_inherit.vo.Daughter;
import javaexp.a07_inherit.vo.ScoccerPlayer;

public class A01_Basic {
	/*
	 # 상속
	 1. 자바는 상위 클래스를 상속하면 하위 클래스의 내용에서 추가해서 상위 클래스의 구성요소를 그대로 사용할 수 있을 뿐만 아니라
		추가된 내용을 처리할 수 있다.(상속1단계)
	 * */
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 =new Son();
		s1.name = "아들 최길동";	//상속을 받았기에 사용 가능
		s1.age = 25;
		s1.show(); 		//상위 클래스에 있으면 그대로 사용 가능
		s1.show2();
		Daughter d1 = new Daughter();
		d1.hobby="탁구";	//상위에 있는 필드
		d1.cooking();	//상위에 있는 메서드
		d1.height=160;	//추가적인 필드
		d1.goShpping();	//추가적인 메서드
		ScoccerPlayer sp = new ScoccerPlayer();	//호출
		sp.running();	//상위 메서드
		sp.drivingBall();	//하위 메서드
		sp.runningWithBall();	//하위 메서드
		sp.trainning();	//상위 메서드
	}

//ex) Player 운동선수 running() 달리기를 하다 
//		위 Player 를 상속받아 ScoccerPlayer 축구선수
//		drivingBall() 축구 공을 몰다!
//		==> 

	public void ScoccerPlayer() {
		// TODO Auto-generated method stub
	}
}

class Father {	///Father선언
	String name;
//	Father(String name){
//		this.name=name;
//	}
	void show( ) {
		System.out.println("이름"+name);
	}
}
class Son extends Father{	
	int age;
	void show2() {
		show();
		System.out.println("나이:"+age);
	}
}
