package javaexp.a12.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A08_ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 # 파일의 내용을 가져오는 FileReader 객체
		 	1. 상속관계
		 		InputStream > Reader > FileReader
		 	2. 내용
		 		특정한 경로의 파일에 있는 문자열을 읽어와서 
		 		화면에 출력하거나, 변수에 할당하여,
		 		원하는 데이터를 사용할 때 활용하는 객체
		 	3. 주요 내용 메서드 내용
		 		1) 생성자 : new FileReader(경로/파일명);
		 		2) 기능메서드 : read() 글자 1자씩 code값을 int로 가져옴.
		 					 char 타입 캐스팅시, 문자로 변환 
		 					 공백이나 줄 바꿈도 포함하여 가져옴
		 					 System.out.print((char)code);
		 		3) code 값이 -1 일 때, 더이상 문자가 없을 때 이다.
		 				==> read() 메서드는 파일에서 한 문자씩 읽어온 후, 
		 					그 문자의 코드값을 int 타입으로 반환함.
		 					파일에 더 이상 읽을 문자가 없으면 -1을 반환 
		 					따라서, read() 메서드의 반환값이 -1이면 
		 					파일에 더 이상 읽을 문자가 없다는 것을 의미
		 		4) close() 지원해제
		 					 
		 */
//		경로
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp"
				+ "\\a12\\stream\\a05_fileread\\";
//		폴더
		String fname = "a01_poem.txt\\";
		
		try {
			FileReader fin = new FileReader(path+fname);
			
			//파일에 내용(데이터) 있을 때까지 반복
			while(true) {
				int code = fin.read();
				
				
				//파일에 더이상 내용(데이터) 없을때까지 반복
				if(code==-1) {
					break;
				}
				
				//파일에 있는 내용(데이터) 화면에 출력
				System.out.print((char)code);
//				sbf.append((char)code);
			}
			
			//자원 해제
			fin.close();
			System.out.println("\n\n# 파일 읽기종료 #");
//			System.out.println(sbf);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	}

