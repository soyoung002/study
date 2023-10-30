package javaexp.a01_start;

import java.util.*; // 외부 객체를 사용할 때 선언
public class A05_Scanner {

	public static void main(String[] args) {
		//외부 데이터를 입력 받아 출력		
		
//		System.out.println("이름을 입력하세요");
//		//내장된 객체로 문자열 데이터 입력
//		Scanner sc = new Scanner(System.in);
//		//입력한 데이터를 String으로 하는 name에 할당해서 하단에 출력
//		String name = sc.nextLine();
//		System.out.print("입력한 이름은 ");
//		System.out.println(name);
		
		//ex1)좋아하는 과일명을 입력 후, 출력하세요.
		//단, String fruit로 문자열에 할당 처리
		System.out.println("좋아하는 과일명을 입력하세요. "); //print시 해당 줄 뒤에 바로 입력함
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine(); //nextLine -> 입력후 줄 띄우고 입력
		System.out.print("입력한 과일명은 ");
		System.out.println(fruit);
		//return;
	}

}
