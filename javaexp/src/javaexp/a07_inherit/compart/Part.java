package javaexp.a07_inherit.compart;

public class Part {
	//공통으로 컴퓨터부품입니다. 출력 메서드 선언
	//하위에 재정의 할 기능 처리
	//Cpu, Ram, Ssd 클래서 생성 재정의 메서드 처리
	//Z01_ExecuteCom.java에서 다형성 처리까지
	
		//출력 메서드 선언
		public void comInfo() {
			System.out.println("컴퓨터 부품입니다.");
		}
		
//		재정의한 기능
//		ex) 추상메서드 정의 ==> 추상클래스 선언
//			메인에서 에러나지 않게 처리
		public void comInfo2() {
			System.out.println("# 부품 Part #");
		}
		
		
	}
	
	
	
