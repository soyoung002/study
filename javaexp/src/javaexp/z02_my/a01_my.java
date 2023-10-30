package javaexp.z02_my;

import java.util.*;

public class a01_my {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);	//스캐너 객체 생성
//		System.out.println("입력:");
		
//		문자->정수
		String str1 = "1";	//String 문자형 "1" 변수 선언
		int int1 = Integer.parseInt(str1); //str1 문자형 변수를 정수형으로 바꾸어 int1대입
		System.out.println(int1+5);			//문자형 숫자 "1" => 1 로 바꿔주었기 떄문에
											// 1+ 5(정수) 결과값이 나옴
		System.out.println(int1+"10");		//int1은 숫자이고 10은 문자로 인식하기 때문에
											//1 + "10" = 1"10"이 출력됨
//		정수->문자
		int int5 = 50;		//정수 50 변수 선언
		int int6 = 60;
		
		String str5 =String.valueOf(int5);	//숫자 50을 "50"으로 바꾼 것을 str5 대입
		String str6 =Integer.toString(int6);//숫자 60을 "60"으로 바꾼 것을 str6 대입
		System.out.println(str5+int6);		//"50"+"60"="50""60"이 된다.
	
		double d = 1.1111;
		String s = "1.1111";
				
		String str3 = Double.toString(d);	//실수를 문자형으로 바꿀때
		String str4 = String.valueOf(d); 	//실수를 문자형으로 바꿀때
		System.out.println(str3+str3);		//1.1111실수를 "1.1111"로 바꾸므로
											//"1.1111""1.1111" 출력됨
		double d1 = 1.123;
		int a1 = (int)d1;
		System.out.println(a1);
	}

}
