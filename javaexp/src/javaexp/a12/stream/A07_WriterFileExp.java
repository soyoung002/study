package javaexp.a12.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A07_WriterFileExp {
	
	public static void main(String[] args) {
/*
	1. 입력한 데이터/메모리에 있는 변수에 할당된 데이터는 
		특정한 파일에 입력 할 수 있다.
	2. 이 때, 사용하는 객체가 OutputStrieam을 상속 받은
		FileWriter 객체 이상.
	   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		* 상속 관계 
			OutputStream < Writer < FileWriter
				상위						하위
	   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 3. 주소 객체 및 구성요소
	 	1) 파일쓰기 객체 FileWriter("경로명과 파일명")
	 	2) 사용메서드 
	 		write("문자열") : 파일에 쓸 내용
	 		append("문자열") : 기존 파일 내용에서 추가 할 내용
	 		flush() : buffer 메모리 해제
	 		close() : FileWriter 객체 메모리 해제
*/
	
	
//		ex) A07_WriterFileExp.java class생성
//			a04_filewrite 하위에 a01_memberList.txt
//			학원 아이디, 회원명을 입력하고, 등록된 내용을 확인하세요.
	
		//경로 생성
		String path = "C:\\b01_javaexp\\workspace"
					+ "\\javaexp\\src\\javaexp"
					+ "\\a12\\stream\\a04_filewrite\\";
		//파일 생성
		String fname = "a01_memberList.txt";
		
		try {
			FileWriter fout = new FileWriter(path+fname);
			
			fout.write("# 등록된 회원 정보 #\n(아이디)\t(회원명)\n");
			Scanner sc = new Scanner(System.in);
			while(true) {
			System.out.print("# 새로 등록 할 회원 정보를 입력하세요 #\n회원 아이디를 입력하세요:");
			String id = sc.nextLine();
			System.out.print("회원명을 입력하세요:");
			String name = sc.nextLine();
			
			//사용자한테 입력 받아서 입력
			fout.append(id+"\t");
			fout.append(name+"\n");
					
			fout.append("himan\t");
			fout.append("홍길동\n");
			fout.append("higirl\t");
			fout.append("김영희\t");
			
			System.out.println("계속 등록하시겠습니까?(Y/N)");
			String isCon = sc.nextLine();
			
			//equalsIgnoreCase() => 대소문자 상관없이 비교
			if(!isCon.equalsIgnoreCase("Y")) {
				System.out.println("<<<회원 등록 종료>>>");
				break;
			}
	}
			fout.flush();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
