package javaexp.a06_object;

import java.util.Scanner;

public class A07_Methods {
	/*
		 # 객체의 기능메서드의 각 기능별로복합 처리
		 1. 매개변수입력 + 리턴처리
		 	ex) 간단하게 매개변수 입력 후, 연산 결과 리턴 처리
		 2. 매개변수입력 + 프로세스(저장/로직처리)+리턴값(X)
		 	ex) 매개변수 입력 후, 로직처리로 화면에 출력만 처리
		 3. 매개변수입력X + 프로세스 + 리턴처리
		 	ex) 매개변수가 없지만 내부적으로 데이터를 프로세스 처리 후,
		 		리턴데이터 처리하는 형식...
		 4. 매개변수 입력 + 프로세스(저장/로직처리) + 리턴값
		 
		 # 객체의 모든 구성요소들의 복합적으로 처리..
		 1. 생성자 + 필드 : 생성자를 통해서 데이터 처리 초기화
		 
		 2. 필드 + 메서드처리
		 
		 3. 생성자 + 필드 + 메서드처리
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExp01 me01 = new MethodsExp01();
		int plusTot = me01.plus(10,20);
		System.out.println("합산결과:"+plusTot);
		System.out.println("뺄셈결과:"+me01.minus(20,5));
		
		MethodsExp02 me02 = new MethodsExp02();
		System.out.println("물건구매 총계:"+me02.buyTot(3000,2));
		System.out.println("평균:"+me02.getAvg(80,90));
		System.out.println("더 큰수:"+me02.getMaxNum(350, 700));
		
		System.out.println("원의 면적:"+me02.circleArea(50));
		
		me02.getGugu(5);
		me02.triangleDem(10, 20);
		System.out.println("임의의 점수(1~100):"+me02.getRandomPoint());
		
		if(me02.isAgrade()) {
			System.out.println("A학점 입니다.");
		}else {
			System.out.println("A학점이 아닙니다");
			
		}
	}

}
		
		


// 	ex)class MethodsExp02 선언하고,
//	물건가격과 물건갯수를 입력 받아서, 총계를 처리하는 메서드
//	타율 계산하는 메서드로 타석과 안타수를 매개변수로 입력받아, 타율을 리턴하는 메서드
//	두 수의 평균 계산 리턴
//	반지름을 가진 원의 면적 계산(반지름 매개변수 1개)

class MethodsExp02{
//		ex)Scanner로 점수를 입력받아서 합격여부 A학점 여부(90점이상)를 boolean으로 리턴하게 처리하세요.
		boolean isAgrade() {
			System.out.println("점수를 입력하세요:");
			Scanner sc = new Scanner(System.in);
			int pt = sc.nextInt();
			System.out.println("입력된 점수:"+pt);
			return pt>=90;
		}
	//	입력 받은 값을 기준으로 출력 처리하고 리턴값이 없는 경우
	void getGugu(int grade) {
		System.out.println("# "+grade+"단 #");
		for(int cnt=1;cnt<=9;cnt++) {
			System.out.println(grade + " x "+cnt+" = "+(grade*cnt));
		}
	}
	double circleArea(double radius) {
		// Math.PI:3.14
		return Math.PI*radius*radius;
//		return 3.14*radius*radius;		=>위아래중 둘중 아무거나 써도됨.
	}
		public int getRandomPoint() {
			int pt = (int)(Math.random()*101);
			return pt;
		}
//	ex) 삼각형의 밑면과 높이를 입력 받아, 입력된 정보와 넓이를 출력하는 메서드를 선언하고 호출하세요(리턴값 없음)int a(int )
	void triangleDem(int bottom, int heiht) {
		System.out.println("밑변:"+bottom);
		System.out.println("높이:"+heiht);
		System.out.println("면적:"+bottom*heiht/2);
		
//		Circle c1 =new Circle(10);
//		System.out.println("반지름:"+c1.radius);
//		Circle c2 =new Circle(20);
//		System.out.println("반지름:"+c1.radius);
//		
	}
	int getMaxNum(int num01, int num02) {
		return num01>num02?num01:(num01<num02?num02:0); //==> 두수중에 큰 데이터를 리턴하되 동일하면 0
	}
	int getAvg(int num01, int num02) {
		return (num01+num02)/2;
	}
	int buyTot(int price, int cnt) {
		System.out.println("물건의가격:"+price);
		System.out.println("물건의갯수:"+cnt);
	return price*cnt;
	}
	double hitRatio(int hitSeat, int hit) {
		System.out.println("타석:"+hitSeat);
		System.out.println("안타:"+hit);
		return(double)hit/hitSeat;
	}
}
// 매개변수 입력 + 프로세스X + 리턴처리
class MethodsExp01{
	int plus(int num01, int num02) {
		System.out.println("합산처리 메서드");
		return num01 + num02;
	}
	int minus(int num01, int num02) {
		System.out.println("뺄셈처리 메서드");
		return num01-num02;
	}
}