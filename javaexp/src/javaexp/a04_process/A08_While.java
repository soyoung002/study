package javaexp.a04_process;

import java.util.Scanner;

public class A08_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # while문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용하는 반복문
		 1. 기본형식
		 	while(반복할 조건){
		 		반복할 조건이 true일 때 처리할 내용
		 	}
		 	무한 반복 안에서 break
		 	while(true){
		 		처리할 내용
		 		if(반복문을 벗어날 조건) {
		 		break;
		 		}
		 	}
		 
		 	
		 * */
//		int cnt = 1;
//		while(cnt<=10) {
//			System.out.println((cnt++)+"번째 반복"); //cnt 10보다 작거나 같은 수 될때까지 반복
//		}
//		
//		//ex1)while문을 이용해서 10~20까지 출력하세요.
//		System.out.println("*while문 이용한 10~20 출력");
//		int i = 10;
//		while(i<=20) {
//			System.out.println(i++);
//		}
		
		
		
//		//ex2)아래 Scanner를 이용해서 회원명과 기간을 등록하고 종료시 !로 처리하세요
//		System.out.println("*회원등록");
//		
//		Scanner sc2 = new Scanner(System.in);
//
//		String name = "회원명\t등록일수\n";
//		String data = "";
//		while(!data.equals("!")) {
//			System.out.print("등록할 회원명을 입력하세요(종료시 !):");
//			data=sc2.nextLine();
//			if(!data.equals("!")) {
//				name+=data+"\t";				//회원명 누적
//				System.out.print("등록한 회원기간을 입력하세요:");
//				data=sc2.nextLine();		
//				name +=data+"\n";				//등록기간 누적
//			}
//			
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ등록 회원정보ㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.println(name);
//		
//		//ex)구매할 과일명을 입력 받아 리스트하고, 종료할 때 Q를 입력처리
//		
//		String fruitList = "";  //리스트
//		String inData=""; 		//입력할내용
//		while(!inData.equals("Q")) {			//Q가 아닐때
//			System.out.println("구매할 과일명을 입력(종료시 Q):");
//			inData=sc.nextLine();
//			if(!inData.equals("Q")) {
//				fruitList+=inData+" ";
//			}
//		}
//		System.out.println("# 구매할 과일 리스트 #");
//		System.out.println(fruitList);
		
		
		
		/*
		while(true){} : 무한반복
		if(조건) break; 반복문을 중단 처리할 때...
		*/
//		
//		//등록된 학생 리스트 처리
//		Scanner sc3 = new Scanner(System.in);
//		String stuList ="";
//		while(true) {
//			System.out.print("학생명 등록(종료시 Q):");
//			String stName = sc3.nextLine();
//			if(stName.equals("Q")) {
//				break; //Q 입력시 break 반복 종료 
//			}else {
//				stuList+=stName+", ";
//				
//				System.out.print("등록 학생명:"+stName);
//			}
//			System.out.println(sc3.nextLine());
//		}
//		System.out.println("등록된학생:"+stuList);
//		
		
		
		//학생에 수의 따른 점수를 입력 받아서 총점과 평균 처리..
		Scanner sc4 = new Scanner(System.in); //숫자형 데이터를 받기위한
		int no = 0;			// 학생수/번호
		int tot = 0; 		// 입력하여 누적되는 학생 총 점수
		while(true) {
			System.out.print(++no + "번째 학생의 점수입력(종료시-1):");	//n번째 학생..학생수 증가
			int pt = sc4.nextInt(); //형변환 nextInt();
			
			//주의 : 동일한 유형을 입력받을 때는 문제가 없으나, 숫자형과 문자열을 번갈아 받을 때는 반드시 형변환 함수를 사용해야함
			//nextInt(); 사용... bug발생:Integer.parseInt() 
			
			if(pt==-1) {
				--no;	//학생수 하나 줄이고 break
				break;
			}else{
				tot += pt;	//점수 누적하여 총점 계산
			}
		}
		  if (no > 0) {		//학생수가 0보다 큰경우 실행
	            double average = (double) tot / no; // 평균 계산
	            System.out.println("총점: " + tot);
	            System.out.println("평균: " + average);
	        } else {
	            System.out.println("입력된 학생 점수가 없습니다.");
	        }
		
		
		
////		while/break를 이용하여 좋아하는 점심 메뉴를 입력받아서 최종적으로 출력하세요 종료시(!)로 처리
//		Scanner sc5 = new Scanner(System.in);
////		int no = 0; 				//n번째
//		String food = "";		//좋아하는 음식
//		String DataF = "";		//음식 리스트
//		while(!DataF.equals("!")) {
//			System.out.print( "좋아하는 점심 메뉴 입력(종료!입력):");
//			DataF = sc5.nextLine();
//			if(!DataF.equals("!")) {
//				food+= "- " + DataF + "\n";
//			}
//		}
//		System.out.println("\n" + "* 좋아하는 점심메뉴 " );
//		System.out.println(food);
//		
		
	}

}
