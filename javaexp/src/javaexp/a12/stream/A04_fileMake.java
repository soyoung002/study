// ★ 파일 생성하기!!!

package javaexp.a12.stream;

import java.io.File;
import java.io.IOException;

public class A04_fileMake {

	public static void main(String[] args) {

//		ex) A04_fileMake.java
//			a02_exp 폴더를 만들고 해당안의 폴더에 파일 생성
		
//		1.폴드 지정
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12\\stream\\a02_exp\\";	
//		* 주의 파일 폴드 지정할 때,
//		경로명 마지막에 '\\' 추가 해여야
//		경로와 파일명 구분함
		
//		2.파일 지정
		String f01Name=path+"a01_hello.txt";
		
//		2. 파일 객체 선언
		File f01 = new File(f01Name); 
		//ctrl+shift+o  ==> import 단축키
		
		
		System.out.println(f01.exists());
		
		if(! f01.exists()) {	//파일이 없을때
			try {
				f01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("파일 생성!");
	}

}
