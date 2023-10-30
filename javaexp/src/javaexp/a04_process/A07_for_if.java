package javaexp.a04_process;

public class A07_for_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # for문에서 if문 활용
		 1. 반복문 처리시 여러가지 화면 처리나 조건에 의해서
		 	원화는 데이터를 출력할 수 있다.
		 2. for문에서 if문 처리 유형
		 	1) 조건에 따른 출력형식 처리
		 	
		 * */
		// 1~100까지 출력하되 각 단위별로 기본 탭간격, 5단위 마다 줄바꿈 처리
		for(int cnt=1; cnt<=100; cnt++) { 	//1~100까지, 1씩 증가
			System.out.println(cnt+"\t");
			if(cnt%5==0) {
				System.out.println();
				
			}
		}
		//1~10까지 홀/짝 표시..
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.print(cnt);
			if(cnt%2==0) {
				System.out.print("(짝)\t");
			}
			else {
				System.out.print("(홀)\t");
			}
		}
		
		
		//ex1) 0~100까지 짝수만 출력하기 2, 4, 6, 8, 10, ...
		System.out.println("\n\n# 0~100까지 짝수만 출력하기 #");
		for(int cnt=2; cnt<=100; cnt+=2) {
			if(cnt%2==0);
			System.out.print(cnt + ",");
		}
		
		//ex2) 1~100중 3의 배수와 5의 배수 출력하기
		System.out.println("\n\n# 1~100중 3의 배수와 5의 배수 출력하기 #");
		for(int cnt=1; cnt<=100; cnt++) {
			if(cnt%3==0 && cnt%5==0) {
		System.out.print(cnt + ",");
		}	
	}
		
		
		//ex3) 1~100까지 합계 중 1000을 초과하는 최초의 숫자 출력
		System.out.println("\n\n# 1000을 초과하는 최초의 숫자 #");
		int first1000 = 0; 					//초과할 때, 번호
		int sum = 0;						//누적합계
		boolean isFirst = false;			//첫번째일때 true할당
		for(int cnt = 1; cnt<=100; cnt++) {
			sum+=cnt;						//누적 처리
			if(sum>=1000) {					//1000을 넘었을 때
				if(!isFirst) {				//ifFirst=false; 처음만 처리
					first1000=cnt;			//데이터 할당
					isFirst = true;			//isFirst = true; 로 변경
				}
			}
		}
			System.out.println("첫번째로 1000을 넘는 숫자:" + first1000);
//			System.out.println("첫번째로 1000을 넘는 숫자:" + (!isFirst?"없음":first1000));
			
			
			
			
		//ex4) 1~100까지 숫자 중에 7로 나누었을때 4인 숫자 출력
		System.out.println("\n\n# 1~100까지 7로 나누었을때 4인 숫자 #");
			for(int cnt = 1; cnt<=100; cnt++) {
				if(cnt%7==4) {
					System.out.println(cnt + ",");
				}
			}
			
			
		//ex5) 10부터 50까지 숫자중에 13으로 나누었을때 떨어지는 첫번째 숫자 출력
		System.out.println("# 10~50중 13으로 나누면 떨어지는 첫번째 숫자 #");
		int chFirst = 0;
		boolean isFirst2 = false;
		for(int cnt=10;cnt<=50;cnt++) {
			if(cnt%13==0) {
				if(!isFirst2) {
					chFirst = cnt;
					isFirst2 =true;
					}
				}
			}
		//없는 부분에 대한 처리도 check
		System.out.println("첫번째 숫자:" + (!isFirst2? "없음" :chFirst));
		
		
		}
	}
