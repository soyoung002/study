package javaexp.z02_my;
import java.util.*;

public class a01_minigame {

	public static void main(String[] args) {
		
		int comRan = (int)(Math.random()*100+1);	//100의 범위 1부터 시작..100+2면 100의 범위이고 2부터 시작
													//(int)형으로 형변환 처리해줌으로써 정수형으로 바꿈
		Scanner sc = new Scanner(System.in);
		
		System.out.print("# 랜덤 숫자 맞추기 게임 #\n사용할 유저 닉네임을 입력하세요:");
		String useName = sc.nextLine();				//사용자 닉네임 입력
		System.out.println("반갑습니다! "+useName+"님, 게임을 시작하겠습니다.");
		
		do {		//최초의 1번만 실행
			System.out.print("1~100사이의 숫자 입력:");
			int userInt = sc.nextInt();
			
			if(userInt<comRan) {	//유저 < 컴퓨터
				System.out.println("hint)"+userInt+"보다 큰 숫자입니다");
			}
			if(userInt>comRan) {	//유저 > 컴퓨터
				System.out.println("hint)"+userInt+"보다 작은 숫자입니다");
			}
			if(userInt>100) {	//유저 > 100
				System.out.println("경고)1~100까지의 숫자만 입력하세요!");
			}
			if(userInt==comRan)
				System.out.println("정답입니다. 짝짝짝!");
		}while(""!=null);
				System.out.println("숫자를 입력하세요!!!");
}
	
	} //main
 //class