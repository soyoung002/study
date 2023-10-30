package javaexp.a01_start;

import java.util.Scanner;

public class A03_Print {

	public static void main(String[] args) {
		//ctrl + Alt + 화살표 아래 : 해당 라인 화살표 방향으로 복사 
		
		System.out.println("안녕1");
		System.out.println("안녕2");
		System.out.println("안녕3");
		//println() : 줄띄움 하고 출력
		
		System.out.print("사과");
		System.out.print("바나나");
		System.out.print("딸기");
		//print() : 줄띄움 없이 출력
		
		//ex1)친구 3명의 이름을 줄 바꾸기로 출력하시오
		//ex2)좋아하는 음식 3가지를{콤마(,) 단위로} 줄바꾸지 않고 출력하시오
		//마지막은 콤마(,) 생략 가능
		
		//ex1)
		System.out.println();
		System.out.println("# 친구 3명 #");
		System.out.println("철수");
		System.out.println("유리");
		System.out.println("짱구");
		//ex2)		
		System.out.print("좋아하는 음식 3가지 : ");
		System.out.print("사과, ");
		System.out.print("바나나, ");
		System.out.print("딸기");
		
		/*
		 # 줄바꿈과 탭간격 특수문자 처리
		 1. 문자열 출력 명령문 안에서 바로 줄바꿈 처리를 할려면 \n를 포함하여 처리
		 2. 문자열 출력 명령문에서 tab 간격으로 데이터를 출력하려면 \t를 포함하여 처리
		 */
		System.out.println("\n사과\n바나나\n딸기\n오렌지");
		
		System.out.println("no\t물견명\t가격");
		System.out.println("1\t사과\t3000");
		System.out.println("2\t바나나\t4000");
		System.out.println("3\t딸기\t5000");
		
		//ex1) println으로 학생 3명의 국어점수를 줄바꾸어 출력하세요		
		System.out.println("\n# 학생 3명의 국어점수 #"); //이전의 출력값과 공백 주어 문단 구분을 위해 \n 사용
		System.out.println("철수 : 100점");
		System.out.println("유리 : 80점");
		System.out.println("짱구 : 60점");
		
		//ex2) 학생의 번호, 이름, 영어점수를 탭간격으로 처리하여 출력하세요
		System.out.println("\n번호\t이름\t영어점수"); //이전의 출력값과 공백 주어 문단 구분을 위해 \n 사용
		System.out.println("1\t철수\t100");
		System.out.println("2\t유리\t80");
		System.out.println("3\t짱구\t60");

		/*
		 # printf("출력 format만들기", 매필할 변수)형식을 선언 후 해당 형식안에 들어갈 데이터를 처리하는 형식
		 * */
		
		String name = "홍길동";
		int age = 25;
		double salary = 5000.5134;
		System.out.printf("이름 : %s%n" ,name);   //%5s사용시 5칸 띄워지고 출력
		System.out.printf("나이 : %d%n" , age);
		System.out.printf("연봉 : %.2f%n" , salary); 
		
		Scanner sc = new Scanner(System.in);
		String name2 = sc.nextLine();
		int age2 =(int)sc.nextInt();
		double salary2 = Integer.parseInt(name2);
		
		System.out.println(name2);
		
		/*
		 - %s : 문자열 데이터 처리
		 - %d : 정수형 데이터 처리
		 - %f : 실수형 데이터 처리
		 - %자리수s : 자리수와 문자데이터 유형 처리
		 - %자리수d : 자리수와 정수데이터 유형 처리
		 - %소숫점이상.소수점이하f : 자리수와 실수형 데이터 유형 처리
		 * */
	

	}

}
