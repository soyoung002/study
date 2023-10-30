package javaexp.y01_util;

public class A01_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 여러가지 임의의 수를 처리하는 Math.random()
		 	1. Math는 기본 내장 패키지 java.lang 하위에 있는 클래스로 여러가지 수학적인 처리를 한다.
		 	2. 이 클래스 하위에는 객체생성 없이 바로 사용할 메서드들이 있다.
		 		Math r = new XXX() static 메서드는 객체 생성없이 클래스명.필드/클래스.메서드()
		 	3. Math.floor() : 내림, Math.round() 반올림으로 데이터를 처리할 수 있다.
		 		Math.ceil() : 올림으로 데이터를 처리할 수 있다
		 	4. Math.random() : 실수범위 .. 0.0<=Math.random()<1.0(0.999999...) 사이의 임의의 수를 실행시 마다 가져오게 처리함.
		 	5. 이것을 type castion과 함께 이용하면 여러가지 임의의 숫자 처리를 할 수 있다. 
		 		
		 		
		 		0.0 <= Math.random() < 1.0
		 		0.0 <= Math.random()*10 < 10.0
		 		0 <= (int)(Math.random()*10) < 10
		 		1 <= (int)(Math.random()*10+1) < 11
		 		1~10까지의 임의의 정수
		 		10 : 경우의 수
		 		1 : 시작 수
		 		(int)(Math.random()*경우의수+시작수)
		 		
		 		ex) 1~6 (주사위.... 주사위는 1-6까지 있으므로 경우의수는 6, 시작숫자는 1이므로 1)
		 		(int)(Math.random()*6+1)
		 		
		 * */
		
		double r = Math.random();
		System.out.println("기본범위:"+r);
		System.out.println("*10범위:"+r*10);
		System.out.println("정수형으로 절삭:"+(int)(r*10));
		System.out.println("시작수를 1로:"+(int)(r*10+1));
		
		int dice = (int)(Math.random()*6+1);
		System.out.println("임의의 주사위:"+dice);
		
		System.out.println("--------------------------");
		
		
		//ex1) 1/2(홀/짝) 임의로 나오게 하기
		int game1 = (int)(Math.random()*2+1);
		System.out.println("1/2 임의출력:"+game1);
		//ex2) 0~100 사이로 임의로 나오게 하기
		int ranPt = (int)(Math.random()*101);
		System.out.println("0~100 임의출력:"+ranPt);
		//ex3) 1~3(가위/바위/보) 임의로 나오게 하기
		int game2 = (int)(Math.random()*3+1);
		System.out.println("1~3 임의출력:"+game2);

		
		

	}

}
