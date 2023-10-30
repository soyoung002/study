package javaexp.a04_process;

import java.util.*;
public class A02_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# if else 구문
		1. 특정 조건이 true/false로 분기하여 처리해야하는 경우에 주로 사용된다.
		
		
//		*/
//		int iNum = 3; // 입력한 값..
//		
//		if(iNum == 3) {
//			System.out.println("3일 때, 정답");
//		}else {
//			System.out.println("오답입니다!");
//			
//		
		//ex)컴퓨터가 1~5번까지 임의로 저장(Math.random())할 때,
		//	입력한 데이터가 위 컴퓨터의 수를 맞추면 정답
		//	그 외는 오답을 출력하세요
		//	1)변수 지정해서 1~5 임의의 수 저장
		//		hint) 짝수/홀수 표시
		//	2) Scanner를 통해서 예상되는 수를 입력받을 수 있도록 처리
		//	3) if else을 이용해서 맞추면 정답 그 외 오답
		
//		int com = (int)(Math.random()*5+1);	 	
//		//5+1 ==> 컴퓨터 랜덤숫자 5개고(5까지고X 갯수 정하고) 1부터 시작(시작범위 정하면 그 숫자부터 시작)
//		System.out.println("컴퓨터와 함께 하는 숫자 맞추기 게임");
//		
//		System.out.print("hint) ");
//		if(com%2==0) {	//com을 2를 나누엇을때 나머지가 0인경우 짝수 출력
//			System.out.println("짝수");
//		}else{
//			System.out.println("홀수"); //아닌경우 홀수 출력
//		}								//hint 내용에 관한것 끝
//			System.out.println("에상되는 수 입력(1~5):");
//			Scanner sc = new Scanner(System.in);
//			int myNum = Integer.parseInt(sc.nextLine());
//			System.out.println("컴퓨터의 수:"+com);
//			if(com==myNum) {
//				System.out.println("정답");
//		}else{
//				System.out.println("오답");
//				
//			}
//		}
//	}	

		int com2 = (int)(Math.random()*5+1);
		System.out.println("# 컴퓨터 랜덤 숫자 맞추기 #");
		System.out.println("hint) ");
		if(com2%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("예상 숫자 입력(1~5):");
		Scanner sc = new Scanner(System.in);
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("컴퓨터의수 " + com2);
		if(com2==num2) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}
}
	
