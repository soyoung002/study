package javaexp.a04_process;

public class A06_UsingFor {

	public static void main(String[] args) {
		/*
		 # for문의 활용
		 1. for문은 여러가지 출력 형식이나 지역변수/전역변수를 활용해서 처리할 수 있다
		 
		 	ex)1~10까지 합산
		 		전역변수 : {}중괄호 위에 선언하여 누적된 데이터를 처리할 때 사용한다.
		 				
		 		
		 		(* 주의 : 현재 블럭단위와 하위 블럭에 따라서 지역변수가 될 수 있고 전역변수가 될 수 있다.)
		 		코드1
		 		코드2 
		 			num i =1 -> 블럭을 들어가기전에 선언한 변수는 
		 						이 코드 하위에 있는 모든 블럭에 변수를 사용 할 수 있다 ==> 전역변수
		 		for(){블럭단위 안에서 선언되어 사용하는 변수 ==> 이 블럭 범위 안에서만 사용
		 				int num=25; ==> 지역변수
		 				for(){
		 				num : 사용 가능...하위에 있는 중괄호 블럭에서 사용 가능}
		 				
		 				if(){}
		 				
		 				}			
		 				System.out.println(num); X -> 중괄호 안에서 선언한거인데 출력은 범위 밖에서 하므로 오류
		 				System.out.println(i); O -> 블럭 들어가기전에 선언 .. 전역변수
		 				
		 		if(){}
		 		
		 		class 클래스 {void 기능메서드(){코드}}
		 
		 		
		 		
		 		
		 		int sum=0; // 초기에 한번만 0으로 선언(초기화)
		 					//cnt 1 2 3 4 5 6
		 					//sum 1 3 6 10 15 21... 
		 		for(int cnt=1;cnt<=10;cnt++) {
		 		sum += cnt;
		 		System.out.println(cnt+" + ");
		 		}
		 		
		 2. for문은 if조건문과 함께 효과적으로 사용 가능하다
		
		출력형식
		for문을 이용해서 여러가지 출력형식을 만들 수 있다.
		1) 1 + 2 + 3 + 4...
		2) 10! 9! 8! 7!
		3) 	1	2	3	4	5
		*/
		int sum = 0; //초기화
		for(int cnt=1;cnt<=10;cnt++) {
			sum+=cnt;
			System.out.print(cnt+" + ");
		}
		System.out.println("\n합산값:"+sum);
		
		
		int sum2 = 55;
		for(int cnt=10;cnt>=0;cnt--) {
			sum2=cnt;
			System.out.print(cnt+" ! ");
		}
		System.out.println();
		
		System.out.println("감소된 최종값:" + sum2);
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt%3==0) {
				System.out.print("짝!");
			}else {
				System.out.print(cnt);
			}if(cnt<10) { 			
				System.out.print("/");	//10에서 끝나기때문에 10 뒤에는 /가 붙지 않도록 
										//값을 10보다 작은으로 잡아주고 10도 3으로 나누어지기때문에 포함됨
				}
			}
		System.out.println();
//		
//		1. for문은 여러가지 출력 형식이나
//			ex1)100부터 120까지 아래와 같이 출력
//				100 102 104 106...120
		System.out.print("ex1-1)");
		for(int cnt=100; cnt<=120; cnt+=2) {
			System.out.print(cnt + " ");
			}
		
//			ex2)50부터 카운트 다운 10까지
//			50#45#40#.... 10
		System.out.print("\nex1-2)");
		for(int cnt=50; cnt>=10; cnt-=5) {
			System.out.print(cnt +" ");
		}
		
//			ex3) 과일의 단가 입력 개당 @@@원
//				 1개 @@@원
//				 2개 @@@원
//				 3개 @@@원
//				 ...
//				 10개 @@@원
//				 
		System.out.print("\nex1-3)");
		int price = 300; //개당 금액 
		for(int cnt=1; cnt<=10; cnt++) { //1개부터 10개까지 1개씩 증가
			System.out.print(cnt*price+"원 ");
		}
		
		
//		2. 지역변수/전역변수를 활용
//			ex1)200 + 199 + 198 + ... + 150
//				합산 : @@@
		System.out.print("\n\nex2-1) 150부터 200까지의 합산:");
		
		sum = 0;
		for(int cnt=150; cnt<=200; cnt++) {
			sum += cnt;
		}
		System.out.print(sum+"\n");
		
		
		
		
//			ex2)1~10까지 홀수의 합산/짝수의 합산
//				홀수합 : @@, 짝수합 : @@
		System.out.println("\nex2-2) 1~10까지 짝/홀수 합산");
			int oddTot=0;
			int evenTot=0;
			
			for(int cnt=1; cnt<=10; cnt++) {
				if(cnt%2==0)
				oddTot+= cnt;
				else if(cnt%2==1)
					evenTot+=cnt;
				}
			System.out.println("짝수합산:"+oddTot);
			System.out.println("홀수합산:"+evenTot);


		
//			System.out.println("\n\nex2-2)"+evenTot);
//			
//			for(int cnt=1; cnt<=10;) {
//				evenTot+=cnt;
//			}
//			else {					//그 외에는 홀수
//				oddTot+=cnt;
//			}
//			System.out.println("홀수의합:"+oddTot);
//			System.out.println("짝수의합:"+evenTot);
//			
		
		
//			ex3)1~10번의 학생의 임의 점수(1~100점 사이)
//				번호		점수
//				 1		 70
//				 2		 80
//				 3		 90
//				 ..
//				 10		 54
//				 총점		 @@@
//				 평균		 @@@	

		int sum1 = 0;
		System.out.println("\nex2-3)\n번호\t점수");
		for(int no=1;no<=10;no++) {
			int pt = (int)(Math.random()*101);
			sum1+=pt;
			System.out.println(no+"\t"+pt);
		}
		System.out.println("총점:"+sum1+"점");
		System.out.println("평균:"+sum1/10+"점");
		
		
		
		
		}
	}


