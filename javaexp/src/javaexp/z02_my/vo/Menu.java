package javaexp.z02_my.vo;

import java.util.Scanner;

import javaexp.z02_my.vo.End;
import javaexp.z02_my.vo.Menu;

public class Menu {
		
	 public void MenuInfo() {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("\t♥ 알라딘 서점에 오신걸 환영합니다 ♥\n"
	                + "  < 메인화면 로그인시 이용가능..자동으로 이동합니다 >\n");
	     System.out.println("1.로그인\n" + "2.회원가입\n");
	     System.out.print("* 선택 할 메뉴를 고르세요 (숫자만 입력):");
	     int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				Login login = new Login();
				login.loginInfo();
			} else if (select == 2) {
				Join join = new Join();
				join.JoinInfo();
			} else {
				System.out.println("<주의>올바른 메뉴 숫자를 선택하세요!!" 
							+ "\n──────────────────────────────────────────");
				MenuInfo();
			}
	     
	     
	 }//void
	 
}//menu class
