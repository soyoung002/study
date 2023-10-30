// * 원하는 결과값 나오지 않더라도, 할수있는 내용까지 꼭 문제 진행

package javaexp.z01_homework;

import java.util.Scanner;

public class A0919_Homework {

	public static void main(String[] args) {

//		1. 아래 내용을 2중 for문을 활용하여
//		    1) 2X2(행X열)로 ♥를 표시 
			System.out.println("1-1번)2x2 ♥");
			for(int row=1; row<=2; row++) {
				for(int col=1; col<=2; col++) {
					System.out.print("♥");
					}
				System.out.println();
			}
		
//			2) 3X2(행X열)로 ★표시 
			System.out.println("1-2번)3x2 ★");
			for(int col=1;col<=3;col++) {
				for(int row=1;row<=2;row++) {
					System.out.print("★");
				}
				System.out.println();
			}
			
//			3) 입력한 행/열로 입력한 기호표시
//			==> 문제가 요구하는 방향을 이해하지 못하겠음.
			System.out.println("1-3번)문제 무슨말인지 모르겠음.");
			
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");	//다음문제
			
			
//		2. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
			System.out.print("2번) 100부터 90까지 출력 및 합산\n");
			int cnt = 100;			//변수에 100 대입
			int tot = 0;			//100~90까지 합산하기 위한 변수지정
			System.out.print("출력 : ");
			while(cnt>=90) {		//반복할 true 조건 : 값이 90보다 크거나 같은 경우..
				System.out.print(cnt-- + " "); //cnt에 대입시켜준 100의 값부터 1씩 빼주는 결과값을 출력
												//출력은 90까지하지만 출력후 (-)이므로 실제값 89임
				tot = tot+cnt;					//cnt씩 값을 반복문 조건이 끝날때까지 tot에 반복해서 대입
			}
			System.out.println("\n출력값의 합산 : " + tot);
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			//집가서 마저해보깅
			
			
//		3. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
			System.out.println("3번)학생 점수 등록 후 총점과 평균 출력(종료-1)");
			Scanner sc = new Scanner(System.in);
			cnt = 0; //학생 점수
			int no = 0; //학생 수
			int pi = 0; //총합
			
			while(true) {
				System.out.print(++no + "번째 학생 점수:");
				cnt =sc.nextInt();
			if(cnt==-1) {
				--no;
				break;
				}
			if(cnt==-1) {
				System.out.println("종료");
				break;
			}	
			pi+=cnt;
				}
			System.out.println("총점 : "+pi);
			System.out.println("평균 : "+(pi/no));
				
//		4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
			int[] a = {50,100,150};	//배열 초기화
			
			
//		5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. 
		
//		6. **구구단 출력기**
//		   구구단 중 원하는 단을 시작 단과 끝 단으로 지정(입력)하여 출력하게 만드세요.
		
//		7. **자동비밀번호 생성기**
//		   사용자로부터 비밀번호 길이를 입력 받아, 해당 길이만큼의 비밀번호를 생성하세요. 비밀번호는 숫자와 알파벳으로 구성됩니다.
		
//		8. **구간별 합계**
//		   사용자로부터 두 개의 정수 A와 B를 입력받아, A부터 B까지의 합을 출력하세요. 단, A가 B보다 클 경우에는 순서를 바꿔서 계산하세요.
		
//		9. **마름모 모양 숫자 출력기**
//		   사용자로부터 숫자 N을 입력받아, 마름모 모양으로 숫자를 출력하세요. (별찍기와 비슷하지만, 별 대신 숫자를 사용합니다.)
		
//		10. **영문자 변환기**
//		   사용자로부터 영문자 하나를 입력받아, 해당 문자가 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환하여 출력하세요.
		
//		11. **숫자 사이의 연산자 넣기**
//		   사용자로부터 두 개의 숫자를 입력받아, 사이에 '+', '-', '*', '/' 중 하나를 넣어 계산 결과가 제일 큰 연산을 찾아 출력하세요.
		
//		12. **카드 게임 시뮬레이션**
		
//		   컴퓨터의 두 플레이어가 각각 1~10 사이의 카드를 무작위로 받고, 높은 카드를 가진 플레이어가 승리합니다. 게임은 총 5라운드로 진행되며, 승리한 라운드 횟수에 따라 최종 승자를 결정합니다.
//		13. **동전 교환기**
		
//		   사용자로부터 특정 금액을 입력받아, 최소한의 동전 수로 교환하는 방법을 출력합니다. 예를 들어 560원을 입력하면, 500원짜리 1개, 50원짜리 1개, 10원짜리 1개로 출력합니다.
//		14. **할인율 계산기**
//		   사용자로부터 상품의 원가와 판매가를 입력받아, 할인율을 계산하고 출력합니다. 
		
		
		
		
		
		
		
		
		
	}

}