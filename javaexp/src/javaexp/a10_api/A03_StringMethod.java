package javaexp.a10_api;

import java.util.Scanner;

public class A03_StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 # 문자열을 처리한 String 객체의 주요 기능 ㅔㅁ서드
	 	1. charAt(int idx) : 해당 문자열의 0부터 시작한 특정한 문자(char)의 위치 리턴
	 	
	  */
		String greet = "안녕하세요!! 반갑습니다";
		// .length() : 문자열의 길이 리턴
		for(int idx=0;idx<greet.length();idx++) {
		System.out.println(idx+")"+greet.charAt(idx));
		}
		
		
		String data="1991/10/12";
		//ex) 이 데이터는 생년월일을 가져온다.
//				charAt를 이용해서 문자를 추출하여 @@@@년@@월@@일 생을 바꾸어 출력하세요
		char []birth = new char[11];
		birth[0] = data.charAt(0);
		birth[1] = data.charAt(0);
		birth[2] = data.charAt(0);
		birth[3] = data.charAt(0);
		birth[4] = '년';
		birth[5] = data.charAt(0);
		birth[6] = data.charAt(0);
		birth[7] = '월';
		birth[8] = data.charAt(0);
		birth[9] = data.charAt(0);
		birth[10] = '일';
		String birthDay =new String(birth);
		System.out.println(birthDay);
		
		
//		2. getBytes() : 문자열을 byte배열로 가지
		//배열의 코드 값과 문자열을 가져오는 것
		String str1 = "Hello";
		byte[] bytes01 = str1.getBytes();
		for(byte b:bytes01) {
			System.out.println(b+"("+(char)b+")");
			
			
//		3.특정 문자열을 찾을 때, 활용되는 indexOf()
//			1) 기본형식
//				문자열.indexOf("찾을 문자열")
//				해당 문자열 안에서 찾을 문자열의 시작 위치를 index로 리턴해준다.
//				해당 문자열을 포함하지 않으면 -1을 리턴한다.
//			ex)키워드 검색시 주로 활용된다. 포함된 문자열의 시작 위치를 리턴한다.
//			
			String msg = "식사 맛있게 하셨나요?";
			int idxLoc1 = msg.indexOf("식사");	//0
			int idxLoc2 = msg.indexOf("점심");	//-1
			System.out.println("데이터가 있을 때:"+idxLoc1);
			System.out.println("데이터가 없을 때:"+idxLoc2);
			if(idxLoc1!=-1) {
				System.out.println("검색이 되었습니다.");
			}else {
				System.out.println("해당 데이터가 없습니다.");
			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//			ex) String menu = "사과,바나나,딸기"; 선언하고,
//				구매할 물건을 Scanner를 통해 입력 받았을 때,
//				구매가능 여부를 조건문으로 출력하세요.
			String menu = "사과,바나나,딸기";
			Scanner sc = new Scanner(System.in);
			System.out.print("판매 과일 리스트:"+menu);
			System.out.print("구매할 과일 입력:");
			String buy = sc.nextLine();
			if(menu.indexOf(buy)!=-1) {
				System.out.println("구매 가능 !!");
			}else {
				System.out.println("판매하는 물건이 아닙니다!!");
			
		}
	}
	}
	}

