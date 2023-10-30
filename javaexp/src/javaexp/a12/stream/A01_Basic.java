package javaexp.a12.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//import java.va.Sti;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # 데이터를 전송하는 Stream
		 	1) 자바에서는 Stream이라는 API객체를 통해서,
		 	   데이터를 입력하거나 출력을 하는 등 처리하고 있따.
		 		==> 파일의 데이터를 입/출력 또는 파일 자체를 전송 처리
		 			문자를 입력받아 출력하는 처리
		 			입력된 문자를 네트워크를 통해 전송하여 전달하는 처리
		 			
		 			프로그램의 메모리/메이터 vs ssd ssd나 hdd의 저장 메모리/데이터
		 			mian()//
		 			하드웨어적으로 저장된 class를 컴파일 시켜,
		 			cpu/ram메모리를 통 수행 후 메모리를 할당하여
		 			class 메모리를 처리..(소프트웨어적 메모리)
		 	2) 기본 객체
		 		- 입력처리 : InputStream
		 					==> java에서 지원하는 기본 입력 처리 객체
		 						System.in : InputStream객체를 리턴하는 처리 객체
		 		- 출력처리 : OutputStream
		 					==> java에서 지원하는 기본 출력 처리 객체
		 						System.in : OutputStream객체를 리턴하는 처리 객체
		 		
		 	# 기초 예제
		 	 * 출력하기
		 		1) InputStream을 통해 입력된 데이터 OuputStream을 통해 출력하기
		 			1. InputStream is = System.in
		 				자바의 기본 입력 Stream System.in을 
		 				InputStream가 리턴되어 변수 is로 선언
		 			2. InputStream은 다음과 같은 데이터를 처리한다.
		 				* 메서드 read(): read()메서드를 통해 ,
		 				   				console창에서 입력된 문자를 
		 				   				byte단위로 입력 받게 처리한다.
		 				   				==> byte code = is.read();
		 			그리고 이 byte는 char유형으로 글자 한자를 만들 수 있고, 
		 			이것은
		 		2) OutputStream os = System.ou
		 			자바의 기본 출력 Stream으로 Sytem.out을 
		 			OutputStream으로 처리되어 변수 os에 할당한다.
		 * */

			System.out.println("# 기본 입력 Stream 활용 #");
			System.out.print("영문 글자 1자를 입력하세요:"); //
			
			
			InputStream is = System.in;
			
			
			try {
				int code = is.read();	//입력으로 IO 발생 컴파일 필수 예외처리
				
				//자바에서 콘솔창에 출력하는 출력 스트림객체 선언
				OutputStream os = System.out;
				System.out.print("입력한 내용:");
				
				//출력 스트림을 통해서 코드값을 출력
				os.write(code);
				
//				하드위에 ===> 소프으웨어
//				하드웨어 <== 소프트웨어
//				1. 단위가 작으면 바로 전송
//				2. 단위가 많으면 한번에 이동할수있는 데이터를 모아서 전송 
//				    : 단위가 많으면 넘길수 있는 만큼 특정한 곳에 쌓아두었다가 
//					  한꺼번에 전달하는 것이 효율 ==> 버퍼 메모리
//				3. 자원의 해체	
//					버퍼 메모리 해제 : flush()
//					일반 Steam은 해제 : close()
				
				//임시 메모리 해제
				os.flush();
				
				System.out.println("입력한 문자 코드값:"+code);
				System.out.println("입력한 문자:"+((char)code));
				
				//OutStream 객체 지원 해제
				os.close();
				
				
				//InputStream 객체 지원 해제
				is.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	}

}
