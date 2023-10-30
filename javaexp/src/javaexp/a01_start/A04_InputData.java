package javaexp.a01_start;

public class A04_InputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		 
		 자바 한줄 삭제 ctrl + d
		 
		 # 자바의 데이터 입력 처리
		 1. String[] args을 활용하는 방법
		 
		 	1) java를 컴파일(사람이 코딩한 언어를 컴퓨터가 인식하는 언어로 바꾸는 방식) 
		 		과정을 거치면 @@@.class 파일이 생성된다
		 	 	ex. javac @@@.java 
		 	 	==> @@@.class
		 	 	ex. java @@@ main()가 있으면 실행이 된다.

		 	2) 컴파일 과정을 거친 @@@.calss는 
		 		java.@@@로 실행된다.
		 	
		 	3) java @@@ 사과 바나나 딸기 형식으로 실행하면
		 	String[]args안에 {"사과","바나나","딸기"}로 할당되어 ...5줄 참고
		 	args[0] : 배열명[index번호] 형태로 사용 할 수 있게 된다...0부터 시작
		 	
		 	4) eclipse에서는 이런 내용을 처리하기 위해서 실행 옵션에 argument가 있고
		 	그 옵션에 사과 바나나 딸기를 입력하면 위와 같은 데이터 처리가 가능하다.
		 	
		 2. Scanner sc = new Scannar(System.in)을 활용하여
		 	Console에 입력된 데이터를 처리하는 방법
		  */
		System.out.println("입력데이터!");
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/
		
		//ex1)짜장면/짬뽕을 입력 받아서 출력하세요 (내부출력)
		//외부출력 오른쪽 마우스 Run As > 아래것 > 두번쨰 탭에서 입력
		System.out.println(args[0]); 
		System.out.println(args[1]);


		
		
	}

}
