package javaexp.a12.stream;

import java.io.File;

public class A05_DirectoryMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		 
		 # 디렉토리도 파일 객체에 의해 생성한다.
		 	1. mkdir()라는 메서드를 통해 디렉토리 생성
		 
		 * */
		
//		ex) a03_exp 패키지 생성하기..
		String path1 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12\\stream\\";
		File path01 = new File(path1+"a03_exp");
		path01.mkdir();
		 
//		ex) a01_exp 디렉토리 안에, 
//			a01_dir1 ~ a10_dir까지 경로를 만들어 보세요.
		
		String path2 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12\\stream\\a02\\exp\\";
		for(int cnt=1; cnt<=10; cnt++) {
			String dir01 = "a01_dir"+cnt;
			File path02 = new File(path2+dir01);
			path02.mkdir();
			System.out.println(dir01);
		}
		System.out.println("생성완료!");
		
	}

}
