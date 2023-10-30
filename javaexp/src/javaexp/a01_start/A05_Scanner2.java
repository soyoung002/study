package javaexp.a01_start;

import java.util.*; 
public class A05_Scanner2 {

	public static void main(String[] args) {
//		System.out.print("* 구매 할 물건 정보를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		String itemName = sc.nextLine(); 
//		System.out.print("물건명 : ");
//		System.out.println(itemName);
//		
////		System.out.print("* 구매 할 물건 가격을 입력하세요 : ");
//		String itemPrice = sc.nextLine();
//		System.out.print("가격 : ");
//		System.out.println(itemPrice + "원");
//		
////	System.out.print("* 구매 할 물건 갯수를 입력하세요 " );
//		String itemCount = sc.nextLine(); 
//		System.out.print("갯수 : ");
//		System.out.println(itemCount + "개");
		
		
		//입력해야 할 정보 관련 질문 너무 많음 -> 이전 사용 코드 주석 처리 후 개선한것 코드 뒤 주석 처리하기
		//추가로 입력한 정보 한번에 정리되어 나오도록 추가하기
		
		
		//* 수정 후
		System.out.print("* 구매 할 물건 정보를 입력하세요 * \n물견명 : ");
		Scanner sc = new Scanner(System.in);
		String itemName = sc.nextLine(); 
		
		System.out.print("가격 : ");
		String itemPrice = sc.nextLine();

		
		System.out.print("갯수 : " );
		String itemCount = sc.nextLine(); 

		System.out.println("* 구매 할 물건 정보 *");
		System.out.print(itemName + itemPrice + "원" + itemCount + "개");
		
		
	}

}
