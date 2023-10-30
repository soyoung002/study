package javaexp.z02_my;

import java.util.Random;
import java.util.Scanner;

public class Z01_Game {


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		/*
		 # 컴퓨터와 하는 가위/바위/보 게임
		 	1 배열로 가위/바위/보 선언
		 	2 컴퓨터는 랜덤
		 	3 나는 Scanner에 의해 번호 선택
		 	  (1.가위 2.바위 3.보)
		 	4 두개의 내용을 비교하여 승/무/패 결정
		 	5 위 내용을 3회 바복 처리하여 승/무/패 누적
		 * */
		
		int win,eq,def; win=eq=def=0; // 승무패 선언.
		
		//배열 생성
		String [] games = {"가위","바위","보"};
		
		System.out.println("# 컴퓨터와의 가위!바위!보! 게임 #");
		
		for(int cnt=1;cnt<=3;cnt++) {
			System.out.println(cnt+"번째 게임");
		
		System.out.print("1.가위 / 2.바위 / 3.보\n숫자로만 입력하세요^^\n사용자의 선택:");
		
		Scanner sc = new Scanner(System.in);
		int myIdx = sc.nextInt()-1;
		String myChoice = games[myIdx];
		
		System.out.println("당신의 선택:"+myChoice);
		
		
		//r이라는 이름의 Random 객체 생성
		//Random객체는 난수를 생성하는데 사용
		Random r = new Random();
		
		//0~2까지 배열 임의로 나옴(0부터 시작..0 1 2 => 3개)
		//r 객체의 nextInt() 메서드를 사용하여 배열에서 
		//임의의 인덱스를 선택하고  nextInt()메서드는 0부터 해당 범위의 정수중 하나를 반환
		//배열의 크기가 3이므로 0부터 2까지 정수중 하나를 반환
		int comIdx = r.nextInt(3);
		
		//임의 index로 컴퓨터 선택
		//rIdx 변수에 저장된 인덱스를 사용하여 games 배열에서 값을 선택합니다. 선택된 값을 comResult 변수에 저장합니다.
		String comResult = games[comIdx];
		System.out.println("컴퓨의 선택:"+comResult);
		if(myIdx==comIdx) {
			System.out.println("무승부");
			eq++;
		}else if((myIdx+2)%3 == comIdx) {
			win++;
			System.out.println("승리^^");
		}else {
			def--;
			System.out.println("패배ㅜㅜ");
		}
	}
		System.out.println("# 최종 결과 #");
		System.out.println(win+"승, "+eq+"무 "+def+"패");
		
		/*
		 
						{"가위","바위","보"};
			chIdx			0	 1	  2
			rIdx			0	 1	  2
			
			1. 비길때		 myIdx = comIdx
			
			2. 나의승		 		   가위  바위   보 
						 myIdx 		0 	 1	  2
						            보   가위  바위
						 comIdx		2	 0	  1
			
			* 규칙을 찾고 ==> 비교 조건 찾기
			 			  (ex) ++myIdx == comIdx
						  * 사용자 승리 조건 
						  : (myIdx+2)%3 == comIdx
						  
			3. 컴퓨터의 승	 		   가위  바위   보 
						 myIdx 		0 	 1	  2
						           바위   보   가위
						 comIdx		1	 2	  0		
						  * 컴퓨터 승리 조건 
						  : (myIdx+1)%3 == comIdx
						  
		
		*/
		
		

	}

}
