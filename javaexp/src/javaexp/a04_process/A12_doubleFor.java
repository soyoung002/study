package javaexp.a04_process;

public class A12_doubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 # 중첩 for문
//		 1. for문 안에 for문 처리하는 내용
		 
		 
		
//		구구단...
		for(int grade=2;grade<=9;grade++) {			//2~9단까지
			for(int cnt=1;cnt<=9;cnt++)	{			//n*1~9
				System.out.printf("%d x %d = %d\n", grade, cnt, grade * cnt); //%d ==> 다음것 출력되어 보여줌
				
				
			}
		}
		
//		*로 직사각형 모양 출력
		for(int row = 1;row<=5;row++) {		//세로 * 5개
			for(int col=1;col<=8;col++) {	//가로 * 8개
				System.out.print("*");
			}
			
			System.out.println();
		}
		
//		* star 만들기
//		for(int row = 1;row<=10;row++) {		//세로 * 5개
//			for(int col=1;col<=row;col++) {	//가로 * 8개
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
		
		
//		ex1)시간 시:분 표시하여 출력
//			0시0분
//			0시1분
//			...
//			1시0분
//			...
//			23시59분
//		for(int hour =0; hour<23; hour++) {			//0부터 23까지
//			for(int min=0; min<60; min++) {
//				System.out.printf("%d 시 %d\n", hour, min);
//			}
//		}
//		System.out.println();
//		
//		ex2) 2중 for문 활용하여 행/열 테이블표시(3행3열)
//			(1행1열) (1행2열) (1행3열)
//				  	 ...	
//							(3행3열)
		for(int a = 1;a<=3;a++) {
			for(int b = 1;b<=3;b++) {
				System.out.printf("%d행%d열\t",a,b);
			}
			System.out.println();
		}
		
		
	}

}
