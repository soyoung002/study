package javaexp.z02_my.vo;

import java.util.Scanner;

public class Book {
	

	Scanner sc = new Scanner(System.in);

	public void childBooks() { // 어린이 추천도서
		System.out.println("1. 어린왕자");
		System.out.println("2. 백설공주");
		System.out.println("3. 신데렐라");
		System.out.println("4. 콩쥐팥쥐");
		
		System.out.println("* 이전메뉴로 돌아가려면 '이전'을 입력하세요");
		String back = sc.nextLine();
		
		if(back.equals("이전")) {
			miniMain mini01 = new miniMain();// 로그인
			mini01.miniInfo();
		}
	}
	public void bestBooks() { // 베스트 도서
		System.out.println("1. 고양이 해결사 깜냥 6");
		System.out.println("2. 적당한 거리를 두고싶어");
		System.out.println("3. 그대들, 어떻게 살 것인가");
		System.out.println("4. Java의 정석");
		
		System.out.println("* 이전메뉴로 돌아가려면 '이전'을 입력하세요");
		String back = sc.nextLine();
		
		if(back.equals("이전")) {
			miniMain mini01 = new miniMain();// 로그인
			mini01.miniInfo();
	}

}
}
