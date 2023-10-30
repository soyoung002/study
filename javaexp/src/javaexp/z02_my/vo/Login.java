package javaexp.z02_my.vo;
import java.util.*;

import javaexp.z02_my.vo.Menu;

public class Login {	//login 클래스 생성
	
Scanner sc = new Scanner(System.in);

	public void loginInfo() {		
	
		Menu menu=new Menu();
				
		System.out.print("\n# 로그인 #"
				+"\n아이디를 입력하세요:");
		String idInfo = sc.nextLine();
		System.out.print("비밀번호를 입력하세요:");
		String passInfo = sc.nextLine();
		

		if (idInfo.equals("회원가입")) {
			Join join = new Join();
			join.JoinInfo();
		} else if (idInfo.equals(Join.id) && passInfo.equals(Join.pwd)) {
			System.out.println(">> 로그인 성공 <<\n");
			miniMain mini01 = new miniMain();// 로그인
			mini01.miniInfo();
		} else {
			System.out.println("<경고>존재하지 않는 회원이거나 입력정보가 올바르지 않습니다!!" 
						+ "\n회원가입을 원하시면'회원가입'을 입력해주세요.");
			loginInfo();
		}
		
	}
	
}