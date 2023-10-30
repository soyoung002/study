package javaexp.a04_process;
import java.util.*;
public class A09_do_while {

	public static void main(String[] args) {
		/*
		 1. 반복시, 최소한 1번을 수행하고 반복을 중단 처리할 때
		 	사용하는 구문이 do{}while(조건); 구문이다
		 2. 기본 형식
		 	do{
		 		반복수행 할 내용:최소 1번은 수행
		 	}while(반복조건);
		 	
		 * */

//		ex) 비밀번호 확인-> 올바른 비밀번호를 입력할 때 까지 계속 비밀번호를 물어보는 내용
//		Scanner sc = new Scanner(System.in);
//		String corPass = "java123";	//정해진 비밀번호
//		String inPass;				//스캐너로 입력한것
//		do {			//우선 수행할 내용(1번은 수행)
//			System.out.println("비밀번호 입력:");
//			inPass  = sc.nextLine();
//		}while(!inPass.equals(corPass));		//정해진(corPass) 비밀번호와 입력한 내용이 같지 않으면 계속 반복
//			System.out.println("비밀번호 일치");
//		
			
//		ex1)점수를 입력받아서 누적합을 출력하되 종료시 0을 입력처리
		
		
//		Scanner sc1 = new Scanner(System.in);				//사용자로부터 입력받기
//		int sum = 0; 			// 누적 점수 초기화
//		int inPT;				// 입력받은 점수
//		do {					// 1번은 무조건 실행됨
//			System.out.print("점수 입력(종료 0):");	//출력
//			inPT = sc1.nextInt();			//점수를 입력
//			sum += inPT;	//같은 것임 : sum = sum+inPT;		//점수를 입력할때마다 누적점수 sum변수에 쌓임
//			System.out.println("현재까지의 누적 합"+sum);		//출력
//		}while(inPT!=0);	//0입력시 종료
//		System.out.println("종료!!!"); //0입력시 나오는 문구
//			
			
//		ex2)컴퓨터와 숫자 맞추기 게임(1~100까지의 숫자)
//		컴퓨터의 임의의 숫자를 맞출 때까지 반복, 맞출시 종료
//		불일치시 컴퓨터의 숫자가 사용자가 입력한 숫자보다 큰지 보다 작은지 hint를 준다
		Scanner sc2= new Scanner(System.in);	//사용자로부터 입력 받기
		int comRan = (int)(Math.random()*100+1);
		int inNum;	//사용자가 입력한 숫자
		do {
			System.out.print("1~100사이의 숫자 입력:");
			inNum = sc2.nextInt();
			if(inNum<comRan) {
				System.out.println(inNum + "보다 큰수를 입력하세요(hint)");
			}
			if(inNum>comRan) {
				System.out.println(inNum + "보다 작은수를 입력하세요(hint)");
			}
		}while(comRan!=inNum);
		System.out.println("정답완료");
		
		
		
		
		
		
	}

}
