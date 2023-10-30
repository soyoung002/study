package javaexp.z02_my.vo;

import javaexp.z02_my.vo.Menu;

public class End {
	
	public void EndInfo() {
	System.out.println("* 로그아웃 완료\n");
	
	Menu menu01 = new Menu();// 로그인&회원가입 선택
	menu01.MenuInfo();
	}
}
