package javaexp.z02_my;

import java.util.Scanner;
import javaexp.z02_my.vo.Join;
import javaexp.z02_my.vo.Login;
import javaexp.z02_my.vo.QnA;
import javaexp.z02_my.vo.End;
import javaexp.z02_my.vo.Menu;

public class Main {
	
//	조건문으로 구분해서 클래스 불러오기
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\t♥ 알라딘 서점에 오신걸 환영합니다 ♥\n"
			+ "  < 메인화면 로그인시 이용가능..자동으로 이동합니다 >\n");
	System.out.println("1.로그인\n"+"2.회원가입\n");		
	System.out.print("* 선택 할 메뉴를 고르세요.(숫자만 입력):");
	
	int memu = Integer.parseInt(sc.nextLine());
/*	
	sc.nextLine()은 사용자로부터 한 줄의 문자열을 입력
	사용자가 키보드로 입력한 값을 문자열로 읽어옵니다.
	Integer.parseInt(...)은 문자열을 정수로 변환하고 이 값을 int menu에 저장
	
	즉, 사용자로부터 입력받은 문자열을 정수로 변환하여 int menu에 저장하여 사용
	*/
	
	Join join01= new Join();
	join01.JoinInfo();	//회원가입 정보 입력
	
	switch(memu) {
	case 1 : 
		Login log01 = new Login();
		log01.loginInfo();	//id, pass 입력
		break;
		
		
	case 2 : 
		System.out.println("\n\t< 회원가입 >"
						+ "\n*아래의 회원가입 정보를 기입하세요.");
		
		System.out.print("- 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("- 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("- 이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("- 비밀번호 : ");
		String pwd = sc.nextLine();
		
		
		System.out.print("- 비밀번호 재입력 : ");
		String pwdRe = sc.nextLine();
		
		while(!pwd.equals(pwdRe)) {
			System.out.print("(경고)설정한 비밀번호와 일치하게 입력하세요! "
					+"\n- 비밀번호 재입력 : ");
			pwdRe = sc.nextLine();
		}
		System.out.println("\t\t"
				+ "[ 비밀번호일치 ]");
			
			/*
			 !는 부정 연산자 
			 !pwd.equals(pwdRe)는 pwd와 pwdRe가 일치하지 않는다는 것을 의미
			 while (!pwd.equals(pwdRe)) {}
			 ==>pwd와 pwdRe가 일치하지 않는 동안 코드 블록 안의 코드가 반복해서 실행됩니다.
			 */
	
		System.out.print("- 휴대전화('-'없이입력) : ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("\n┌\t정보확인\t┐\n"
				+ "│\t이름:"+name+"\t│\n"
				+ "│\t아이디:"+id+"\t│\n"
				+ "│\t비밀번호:"+pwd+"t│\n"
				+ "│\t이메일:"+email+"\t│\n"
				+ "│\t휴대번호:"+phoneNumber+"\t│\n"
				+ "\n* 위의 입력하신 정보로 회원가입 하시겠습니까?(숫자만 입력):"
				+"\n- 1.네\n- 2.아니요\n- 3.정보 수정하기");
		String Re = sc.nextLine();
		
		
		
		
		
		
		
		
		}//switch
	
	
	
	
	
	}//main
}//class main
