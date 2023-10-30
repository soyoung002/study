package javaexp.z02_my.vo;
import java.util.*;
import java.util.Scanner;

public class miniMain {
	
	public void miniInfo() {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("* 원하는 메뉴를 선택하세요(숫자만 입력)\n"
			+"1. 도서 검색\n"
			+"2. 베스트 셀러 도서 조회\n"
			+"3. 어린이 추천 도서 조회\n"
			+"4. 고객문의\n"
			+"5. 로그아웃");
	String Select = sc.nextLine();
	
	Search search01 = new Search();//검색
	Book book01 = new Book();//도서조회
	QnA qna01 = new QnA();//고객문의
	End end01 = new End();//로그아웃
	
	switch (Select) {
	case "1":
		System.out.println("* 검색 할 도서 정보를 입력하세요 :");
		search01.SearchInfo();			
		break;
	case "2":
		book01.bestBooks();
		break;
	case "3":
		book01.childBooks();
		break;
	case "4":			
		qna01.QnAInfo();
		break;
	case "5":			
		end01.EndInfo();
		break;
	}
	
	
	
	}
	
}
