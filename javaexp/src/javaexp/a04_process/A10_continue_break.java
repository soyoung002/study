package javaexp.a04_process;

public class A10_continue_break {

	public static void main(String[] args) {

//		# 반복문제어 continue, break
//		1. if문과 주로 함께 사용 
//		2. continue : 해당 반복 step에서 나머지 코드부분은 건너뛰고 다음 step로 진행
//		3. break : 반복하던 것 중단처리
		
		int grade = (int)(Math.random()*8+2);
		for(int cnt=1;cnt<=9;cnt++) {
			if(cnt==4) continue;	// *4는 다음 단계로 넘어간다..@*4 생략
			if(cnt==8) break;		// *8일때 반복 중지 처리...@*8일시 중지
			System.out.println(grade + "x" + cnt + "=" +(grade*cnt));
		}
		
		//1~10까지 홀수만 출력
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt%2==0) continue;	//짝수일 때는 다음으로 넘어감
			System.out.println(cnt + ", ");
		}
		System.out.println();		
		
		//합계가 50이 넘는 시점에 출력 및 중단 처리
		int sum = 0;
		int cnt = 0;
		while(true) {
			cnt++;
			sum+=cnt;
			if(sum>50) {
				System.out.println("합계가 50이 넘는 최초:"+cnt);
				System.out.println("합계:"+sum);
				break;
		}
	}
//		ex1)1~50까지 출력하되 5의 배수는 제외하고 출력
		for(int i=1;i<=50; i++) {
			if(i%5==0) continue;
			System.out.println(i+",");
		}
		System.out.println();
		
//		ex2)구구단 5단을 출력하되 *7일때 중단 처리
		
		grade = 5;	//맨 위에 이미 선언된 변수지만 재할당을 통해 재사용
		for(cnt=1;cnt<=7;cnt++) {
			if(cnt==7) break;
			System.out.println(grade+" x "+cnt+" = "+(grade*cnt));
		}
		
		



	}
}
