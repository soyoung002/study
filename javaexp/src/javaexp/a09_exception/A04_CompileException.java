package javaexp.a09_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class A04_CompileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 컴파일 예외
		 	1. 반드시 컴파일 하여야 되는 예외
		 	2. java의 특정 코드는 반드시 예외를 하여야 하는 경우가 있다
		 		==> 필수 예외 처리
		 			프로그래밍적으로 에러의 가능성이 높고,
		 			에러가 났을 때 예외처리를 하지 않으면 
		 			프로그램 오류가 발생 할 수 있는 코드는 
		 			반드시 예외처리를 하여 안정성을 유지하여야한다.
		 			주로 파일로 된 데이터를 실제 객체로 처리
		 			외부에서 데이터를 가져오는 경우(데이터베이스 접속 처리 등..) 
		 			예외 처리를 반드시 해야 함
		 	3. 주로 해당 코드를 처리했을 때, 왼쪽에 에러가 표시됨.
		 	4. eclise의 경우, 해당 예외 처리를 하게 한다.
		 	
		 * */
			// 파일로 있는 클래스를 메모리에 있는 객체로 호출
			try {
				//@@.java ==> @@.class==> 정적 초기화 블럭에 실행
				//main() @@ a = new @@()
				//클래스로 된 내용을 메모리에 로딩해서 처리시 사용
				//추후 DB 접속시 처리 
				Class.forName("aaa.bbb.ccc");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			//ex) inputstream 컴파일 예외 처리..
			InputStream is = System.in;
			try {
				System.out.println("글자를 입력하세요:");
				char code =(char)is.read();
				System.out.println(code);
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("# IOExceptio #");
				System.out.println(e.getMessage());
			}

			//ex)파일을 처리해주는 객체
			File file = new File("aaa.txt");
			try {
				new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//파일을 stream에 의해 전달
			
			
			
	}

}
