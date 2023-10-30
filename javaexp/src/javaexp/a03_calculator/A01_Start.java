package javaexp.a03_calculator;

public class A01_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 자바에서 산술연산자
		 1. +, -, *, /(몫) , %(몫을 제외한 나머지 값)
		 	==> % : 나머지 연산자로 나머지값을 사용할 떄 씀...프로그램에서 알고리즘에 많이 활용 가능
		 			연속된 데이터를 규칙을 지정해서 처리해야 할 때 주로 활용 된다
		 			짝수만 합산 if(cnt%2==0) 	...2로 나눴을 때 나머지가 0인 경우
		 			cnt%3==0?"짝":cnt	...3으로 나눴을때 나머지가 0인경우 -> 3의 배수기 때문에 나머지가 0
		 									3항 연산자 활용//3의 배수일 때는 "짝!"으로 표시 그 외는 숫자로 표시
		 			=> cnt   : 1 2 3 4 5 6 7
		 			   cnt%3 : 1 2 0 1 2 0 1 ...(위의 숫자 3으로 나눈경우 나머지 나눌수없는건 그대로 나머지 떨어지는 가정하에) 
		 			
		  */
		
		int num1 = 25;
		int num2 = 7;
		double num3 = 7.0; //실수이므로 double 사용
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); //num2 사용
		System.out.println(num1 + " / " + num2 + " = " + (num1/num3)); //num3 사용
		
		
		
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); //몫을 뺀 나머지
		// ==> 25/7이 아닌 25-(7*3)=4 .. 4
		

	}

}
