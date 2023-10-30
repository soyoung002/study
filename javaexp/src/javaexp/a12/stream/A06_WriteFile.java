package javaexp.a12.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A06_WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		# 파일의 내용 입력 처리
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
		//경로 생성
		String path = "C:\\b01_javaexp\\workspace\\"
					+ "javaexp\\src\\javaexp"
					+ "\\a12\\stream\\a04_filewrite\\";
		//파일 생성
		String fname = "a01_fileWrite.txt";
		
		try {
			FileWriter fout = new FileWriter(path+fname);
			fout.write("파일에 입력 할 내용-1\n");
			fout.append("파일에 추가 할 내용-2\n");
//			Scanner sc = new Scanner(System.in);
//			System.out.print("파일에 입력 할 내용을 적으세요. ");
//			String addStr =sc.nextLine();
//			fout.append(addStr);
//			fout.append();
			fout.flush();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
