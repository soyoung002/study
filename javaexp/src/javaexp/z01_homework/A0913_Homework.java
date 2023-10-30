package javaexp.z01_homework;

import java.util.Scanner;

public class A0913_Homework {

	public static void main(String[] args) {
		/*
//		 * 2. java의 출력형식을 이용해서 학생 3명의 성적 출력해보기
//		 */
//		System.out.print("홍길동, "); 
//		System.out.print("김길동, ");
//		System.out.println("신길동");
//		
//		System.out.println("홍길동\t김길동\t신길동");
//		
//		System.out.println("홍길동\n김길동\n신길동");
//		
////		/*
//		 3. java의 입력처리 형식 args, scanner를 통해서 구매할 물건 정보
//		 (물건명, 가격, 갯수) 입력해서 출력해보기 
//		 	1) 만들어진 클래스는 main()메서드가 잇을 때, 
//		 		아래와 같이 1단계로 컴파일 하면 class 파일이 생성된다.
//		 		javac A0913_Homework.java 
//		 		==> A0913_Homework.class(기계어 즉, 컴퓨터가 인식 할 수 있는 binary 파일이 생성)
//		 		2단계로 실행 명령어를 수행하면 main()가 이는 클래스인 경우 수행하여 처리된다.
//		 		java A0913_Homework
//		 	2) 이렇게 수행 할 때, 데이터를 이 수행내용에 전달할 때, 
//		 		다음과 같은 코드로 처리된다.
//		 		java A0913_Homework 사과 바나나 딸기
//		 	3) A0913_Homework(클래스파일) 뒤에 있는 사과 바나나 딸기는 
//		 		위 main(String[] args)에 데이터가 할당이 된다.
//		 		String[] args = {"사과", "바나나", "딸기"}
//		 		형태로 배열에 할당이 되며,
//		 		이 배열은 args[0] : "사과"
//		 		 		args[1] : "바나나"
//		 	 			args[2] : "딸기" 에 할당이 된어
//		 		사용할 수 있게 된다.
//		 	
//		 */
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		
//		System.out.print(args[0]);
//		System.out.print("\t");
//		System.out.print(args[1]);
//		System.out.print("\t");		
//		System.out.println(args[2]);
//		
//		// +(연산자, 이어주는 역할)
//		
//		System.out.println(args[0]+args[1]+args[2]);
		
		Scanner sc = new Scanner(System.in); //개체 생성
		//Scanner 사용시 package 다음 import java.util.Scanner; 선언해줘야함
		
		// 정보 입력하기
		System.out.println("# 물건정보(물건명,가격,갯수) 입력 #");
		System.out.print("물견명 : ");
		String name = sc.nextLine(); //String 대문자 시작 후 소문자
		
		System.out.print("가격 : ");
		String price = sc.nextLine();
		System.out.print("갯수 : ");
		String cnt = sc.nextLine();
		
		// 입력한 정보 결과 나타내기
		System.out.println("# 입력된 물건 정보 #");		
		System.out.println(name);
		System.out.println(price);
		System.out.println(cnt);

	}

}
