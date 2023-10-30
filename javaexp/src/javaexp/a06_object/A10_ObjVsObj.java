package javaexp.a06_object;

import javaexp.a06_object.vo.Cpu;
import javaexp.a06_object.vo.Computer;	//이전에 같은 class명 있을경우 지정해줘야 오류안남

public class A10_ObjVsObj {	//객체:객체 생성
//	Controller==>Service==>Dao==>Database
//	

	public static void main(String[] args) {
		/*
		 # 객체 vs 객체 관계
		 1. 자바에서는 객체지향 프로그램의 2단계로 이제 하나의 객체만 사용하는 것이 아니라 
		 	객체와 객체의 연관관계를 통해서 원하는 프로그램을 만들어 간다.
		 2. 기본 형태
		 	1) 포함될 클래스 선언
		 		객체로 만들어질 포함될 클래스의 구조를 선언한다.
		 	2) 포함할 클래스 선언
		 		위에서 만들어진 클래스를 포함할 클래스에서 필드나
		 		메서드의 매개변수로 선언하여 활용할 수 있게 처리한다.

		 	ex)
		 	Cpu : 포함될 클래스
		 	Computer : 포함할 클래스

		 * */
//		포함될 Cpu 객체 생성
//		일반 메모리에 돌아다니는 Cpu객체(ex.매장에 있는 핸드폰)
		Cpu cpu = new Cpu("intel","3.2 i7 quard core");
//		하나의 컴퓨터객체에 할당(특정한 사람이 구매 처리시 그 사람 소속(소유 물건)이된다)
		Computer com01 = new Computer("조립컴퓨터");
		com01.setCpu(cpu); //setCpu(cpu) 사용시 종속됨
		com01.show();
	
	}

}



