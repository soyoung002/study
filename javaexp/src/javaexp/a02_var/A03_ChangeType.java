package javaexp.a02_var;

public class A03_ChangeType {

	public static void main(String[] args) {
		/*
		 # 형변환 처리
		 1. 기본 유형
		 	1) 작은 데이터 유형 ==> 큰 데이터 유형
		 		자동(묵시적) 타입 변환 : promotion
		 	2) 큰 데이터 유형 ==> 작은 데이터 유형
		 		강제(명시적) 타입 변환 : casting
		 	3) 연산에 의해서 꼭 형변환이 필요한 경우에도 casting을 처리한다
		 		* int ==> char으로 표현시..
		 		int code = 66;
		 		char char01 = (char)code;
		 		* 연산에 의해 실수로 표현해야 할 때..
		 		double dbl01 = 10/(double)10/3;
		 		10/3 ==> 정수형 3
		 		(double)10/3 ==> 실수 3.33333...
		 		
		 * */
		
		byte num1 = 25;
		int num2 = num1; // 자동형 변환
		double num3 = num2; //자동형 변환
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		double num4 = 24322.345; 
		int num5 = (int)num4; //강제형 변환(casting) ***
		byte num6 = (byte)num5; //강제형 변환(casting)
		
		System.out.println(num4);
		System.out.println(num5);
		// 32bit(int) 2진수로 ==> 8bit casting해서 10진수로 변환한 데이터
		System.out.println(num6);
		
		//자바에서 정수/정수(나누기) ==> 정수 ...실수로 출력되지 않음. (자바만 그럼)
		System.out.println(10/3);
		
		//1.정수/정수 데이터가 실수로 필요한 경우 나눗셈 연산자 중에 하나를 강제제 변환해서 처리해야함.
		//2.정수 뒤.0으로 표시도 가능
		System.out.println(10/(double)3); //1
		System.out.println(10/3.0); //2
		
		
		System.out.println("--------------------");
		/*
		 1. 사용자로부터 초를 입력 받아 
		 해당 초를 '시, 분, 초'의 형태로 출력하세요
		 (예 : 3661초는 1시간 1분 1초 입니다.)
		 * */
		
		int seconds = 5233; 
		// 초*60		==>		분*60		==>		시
		// 시		==>		시/60(분)		==> 분/60(초)
		
		int hours = seconds/60/60; //초/60/60
		System.out.println(hours+"시");
		System.out.println(hours*60*60+"초(1시간)");
		
		int minues = seconds/60-(hours*60);  //5233초에서 1시간을 제외한 분
		System.out.println(minues + "분");
		
		int rest = seconds-(hours*60*60)-(minues*60);
		System.out.println(rest + "초");
		
		
		System.out.println("--------------------");
		
		/* 
		 2. 문자열 데이터와 숫자형 변환
		 	1) 전제조건
		 		숫자형 문자열 "25", "35.17"
		 		그 외 문자열 "이십오", "삼점일칠"은 에러 발생
		 	2) 정수형 문자열을 정수형으로 변환
		 		int num1 = Integer.parseInt("25");
		 	3) 실수형 문자열을 실수형으로 변환
		 		int num2 = Double.parseDouble("3.17");
		 **/
		
		String num5Str = "25";
		int num05 = Integer.parseInt(num5Str);
		System.out.println("정수형 변환 숫자 + 10 : " + num05);		
		
		
		String num6Str = "3.17";
		double num06 = Double.parseDouble(num6Str);
		System.out.println("실수형 변환 숫자 + 10.5 : " + (num06+10.5));
		
	}

}
