package javaexp.a12.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A09_ReadFileExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ex) a02_memList.txt에 있는 파일의 내용을 가져와서
//			이름:@@@, 국어:@@, 영어:@@, 수학:@@로 출력하세요
//			hint : 문자열.split("")
		
		//경로
		String path ="C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp"
				+ "\\a12\\stream\\a05_fileread\\";
		//폴더
		String fname = "a02_memList";
		
		try {
			FileReader fin = new FileReader(path+fname);
			StringBuffer sbf = new StringBuffer();
			
			while(true) {
				int data = fin.read();
				if(data==-1) {
					break;
					}
				sbf.append((char)data);
			}			
			fin.close();
			System.out.println("현재데이터:"+sbf);
//			(1단계) 줄바꿈으로 데이터 자르기
			/*
	
//			'김' ==> char ==> code '\n' '\r'
			

			 
			 
			 * */
			
			
			
			String[]arr = sbf.toString().split("\n");
			System.out.println("뽑아온 데이터");
			System.out.println("이름\t국어\t영어\t수학");
			for(String str:arr) {
//				System.out.println(str);
//			(2단계) 각 줄단위로 있는 데이터 ,(콤마)로 자르기
				String[] arr2 = str.split(",");
				System.out.print(arr2[0]+"\t");
				System.out.print(arr2[1]+"\t");
				System.out.print(arr2[2]+"\t");
				System.out.print(arr2[3]+"\n");			
			}
			
			/*
			System.out.println("이름:"+arr[0]);
			System.out.println("국어:"+arr[1]);
			System.out.println("영어:"+arr[2]);
			System.out.println("수학:"+arr[3]);
			*/
			
		}catch (FileNotFoundException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
