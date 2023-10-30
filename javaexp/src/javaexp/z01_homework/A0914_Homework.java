package javaexp.z01_homework;

import java.util.*; 

public class A0914_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ex1)
		int num1,num2 ; //선언
		num1 = 10; //할당
		num2 = 4; //할당
		double average = (num1+num2)/2; //두 변수의 평균 계산, double을 통한 실수 결과값 
										//최우선 연산 : ()
		System.out.println("1. 10과 4의 평균 값 : "+average); //출력 
		System.out.println("---------------------------------");
		
//		ex2) 스캐너 이용해서 입력한 숫자대로 평균나오게 수정
		System.out.println("2. 숫자 5개를 입력하여 평균 내기 " + "\n숫자 5개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
//		se.nextLint(); 입력된 문자형 정수를 숫자형 정수로 변환하여 처리
//		String num01 = sc.nextLine();
//		String num02 = sc.nextLine();
//		String num03 = sc.nextLine();
//		String num04 = sc.nextLine();
//		String num05 = sc.nextLine();
		
//		int tot1 = Integer.parseInt(num01);
//		int tot2 = Integer.parseInt(num02);
//		int tot3 = Integer.parseInt(num03);
//		int tot4 = Integer.parseInt(num04);
//		int tot5 = Integer.parseInt(num05); //이전에 내가 짠 것
		int tot1 = Integer.parseInt(sc.nextLine());
		int tot2 = Integer.parseInt(sc.nextLine());
		int tot3 = Integer.parseInt(sc.nextLine());
		int tot4 = Integer.parseInt(sc.nextLine());
		int tot5 = Integer.parseInt(sc.nextLine()); //위의 문단 생략하고 더 간단하게 처리시
		System.out.println( "다섯 숫자의 평균 : " + (tot1+tot2+tot3+tot4+tot5)/5);
		
		System.out.println("---------------------------------");
		
		//ex3)
	//	int US = 1; //달러
	//	int KR = 1100
		//원화 환전 금액 : @달러*1100
		// 1달러 = 1100원, 즉 1,100원=1달러*1,100원

		Scanner sc2 = new Scanner(System.in);
		System.out.print("3. 원화로 계산할 달러 금액을 입력하세요. \n" + "달러 금액 : ");
		String US = sc.nextLine(); //nextLine(); : 입력한 값이 US에 대입되어 문자열 생성
								 	//char a -> ''
									//Scanner.nextLine자체는 문자열"""로 입력받기 때문에 String으로 해야함
									//nextInt로 출력시 정수(숫자데이터)로 입력받는다.
		
		int US2 = Integer.parseInt(US); //스캐너로 출력된 정수형 문자를 숫자로 바꿔줌
		int KR = US2 * 1100;
		
		System.out.println("원화 환산 금액 : " + KR + "원");
		System.out.println("---------------------------------");
		
		
		//ex4)
		System.out.print("4. 사각형의 면적 및 둘레 계산" + "\n사각형의 가로 길이 : ");
		Scanner sc1 = new Scanner(System.in);
		int width = Integer.parseInt(sc.nextLine());
		int heigth = Integer.parseInt(sc.nextLine());
//		int area = (width * heigth) * 2;
//		int round = ()
//		System.out.println("면적은 " + area);
//		System.out.println("둘레는 " + round);
		
		//ex5)
		byte byteValue = 42;
		double doubleValue = byteValue; //자동형 변환
		System.out.println("byte값:"+byteValue);
		System.out.println("double값:"+doubleValue);
		
		//ex6)
//		int intValue = (int)floatValue; // 큰==>작 : 강제형변환(casting 필요)
//		System.out.println("flate값 : " + floatValue);
		
		//ex7)
		int intValue1 = 100;
		double doubleValue1 = 150.5;
		int sumInt = (int)(intValue1+doubleValue1);
		System.out.println("합산되어 casting결과:"+sumInt);
		
		//ex8)
		int num01 = Integer.parseInt("5678");
		System.out.println("실수형변환:"+num01);
		
		//ex9)
		double num02 = Double.parseDouble("-456.789");
		System.out.println("실수형 변환:"+num02);
		
		//ex10)
		int no = 1;
		System.out.println("\t\t\t"+(no++));
		System.out.print("\t\t"+(no++));
		System.out.println("\t\t"+(no++));
		System.out.print("\t"+(no++));
		System.out.print("\t\t"+(no++));
		System.out.println("\t\t"+(no++));
		System.out.print(no++);
		System.out.print("\t\t"+no++);
		System.out.print("\t\t"+no++);
		System.out.print("\t\t"+(no++));
		System.out.println("\t\t"+(no++));
//		
/*
 	1. 두 개의 정수 변수를 선언하고 값들을 할당하십시오.
	이들의 평균을 double로 계산하고 출력하십시오.
	2. 평균 계산 : 사용자로부터 5개의 숫자를 입력받아 그 평균을 출력하십시오. -> 입력 스캐너 사용
	3. 환율 변환 
		사용자로부터 달러 금액을 입력받아 원화로 변환하여 출력하십시오.
		(환율은 임의로 1달러 = 1,100원으로 설정)
	4. 사각형의 면적 및 둘레 계산 :
		사용자로부터 사각형의 가로와 세로 길이를 입력받아 면적 및 둘레를 계산하시오
	5. byte byteValue = 42;
	//암시적 형변환을 사용하여 byteValue 값을 double 타입의 변수에 저장하시오.
	//명시적 형변환을 사용하여 floatValue 값을 int 타입의 변수에 저장하십시오.
	6. float floatValue = 123.456f;
	//명시적 형변환을 사용하여 flatValue 값을 int 타입의 변수에 저장하십시오
	7. int intValue= 100;
	double doubleValue = 150.5;
	//intValue와 doubleValue를 더하고 그 결과를 int 타입의 변수에 저장하고 결과값을 출력하시오.
	8. "5678"이라는 문자열을 int 타입으로 변환하십시오
	9. "-456.789"라는 문자열을 double 타입으로 변환하십시오.
	10. 숫자 피라미드 출력(System.print(), System.out.println()) 등으로
	 숫자 피라미드를 증감 연산자를 사용하여 출력하시오
	 (예제)		1
	 		2		3
	 	4		5		6
	 7		8		9		10	
	 
	



 
 
 
 
 
 
 
 */
	}

}
