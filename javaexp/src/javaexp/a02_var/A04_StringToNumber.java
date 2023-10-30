package javaexp.a02_var;

import java.util.*;

public class A04_StringToNumber {
	// arguments70 80 90 ==> {"70","80","90"}이 args에 들어가고 시작 // 숫자형 문자열
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("* 숫자형 문자열을 숫자로 변환 * ");
		String kor = args[0]; //통해서 숫자로 변환
		String eng = args[1];
		String math = args[2];
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		String tot = kor + eng + math;
		System.out.println("총계 : " + tot); // Integer.parseInt(숫자형 문자열)
		
		int korInt = Integer.parseInt(kor);
		int engInt = Integer.parseInt(eng);
		int mathInt = Integer.parseInt(math);
		
		int totInt = korInt + engInt + mathInt;
		System.out.println("평균 : " + (totInt/3) );
		System.out.println("-------------------------");
		/*
		 # Scanner을 통해서 원하를 달러화로 변환하는 프로그램 처리
		 1. Scanner 객체 생성
		 2. 현재 1달러당 1131.50원 변수 선언
		 3. 입력된 데이터(원)를 문자열로 받아서 형변환 처리
		 4. 계산식 달러 = 원/환율
		 5. 최종 입력된 원화와 달러 출력
		 * */
		// System.in : 자바의 기본적인 입력처리를 하는 내장 객체
		// Scanner : 외부에 입력된 내용을 처리하는 java.util.*  ...패키지에 내장된 객체
		
		Scanner sc = new Scanner(System.in); //import 한 후에, 저장해야 내부적으로 저장과 함께 컴파일이 된다.
		double changRatio = 1131.5; //실수이므로 double 사용
		System.out.print("달러로 변환할 원화를 입력하세요");
		String wonStr = sc.nextLine();
		int won = Integer.parseInt(wonStr);
		int  dollar = (int)(won/changRatio); //소숫점 이하 절삭 처리 시 입력된 결과가 
//												실수형이기에 정수로 변환하려면 casting(강제형 변환) 처리해줘야함.
//		double dollar = won/changRatio; //실수까지 모두 출력시 double 사용
		System.out.println("입력된 원화 : " + won + "원");
		System.out.println("원화에 대한 달러화 : " + dollar + "달러");
		
		
		
		
	}

}
