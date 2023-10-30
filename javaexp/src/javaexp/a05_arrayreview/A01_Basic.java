package javaexp.a05_arrayreview;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 배열 객체 
		 1. 같은 유형의 데이터 여러개를 하나의 메모리에 할당하여 처리
		 	ex) 기차의 호차	... 1호차 2호차 3호차
		 2. 메모리 입장
		 	1) stack : heap영역의 주소값을 할당
		 		배열형태	배열명
		 	2) heap : 실제 배열 객체 저장
		*/
		
		 // 배열의 선언(heap영역에 할당하지 않고 선언
			int [] intArry; //정수형(int) 배열 선언 .. 배열 이름은 @@@(intArry)
			double[] dblArry; //실수형(double) 배열 선언
			String[] strArry; //문자열(String) 배열 선언
		// 배열의 할당(heap 영역에 메모리를 할당)
//			1)크기 지정 : 각 구성요소(index)에 초기값을 할당
			intArry = new int[5]; //5개 int(정수)형 배열을 초기값으로
//									0이 할당된 배열 생성
			System.out.println(intArry[0]); //배열명[index번호]
			System.out.println(intArry[1]); //배열명[index번호]
			System.out.println(intArry[2]); //배열명[index번호]
			System.out.println(intArry[3]); //배열명[index번호]
			System.out.println(intArry[4]); //배열명[index번호]
//			System.out.println(intArry[5]); //배열명[index번호]
//			intArry[5] 에러발생 .. 초기값 0이 할당되서 0부터 시작한 5개
//			: 5개짜리 정수는 index로는 4까지만 선언하고 호출이 가능하다.
			
//			ex) 정수형 pts 3개짜리 배열 선언하고, 초기값을 확인하세요.
			int[] pts;
			pts = new int[3];	//초기값 0인 배열 생성
			pts[0]= 70;	//배열 할당
			pts[1]= 80;
			pts[2]= 90;
			System.out.println(pts[0]);
			System.out.println(pts[1]);
			System.out.println(pts[2]);
			
			
			strArry = new String[3];
//			String은 객체이므로 초기값이 0이 아닌 null이 할당 되있음.
			strArry[0] = "오렌지";
			strArry[1] = "사과";
			strArry[2] = "바나나";
			System.out.println(strArry[0]);
			
			/*
			 배열을 이해할 때..
			 1. 어떤 데이터를 배열 처리 할 것 인가?
			 		기본데이터유형 ==> 배열 ==> 객체
			 			String ==> 배열 ==> 객체
			 			Person ==> 배열 ==> 객체
			 2. 초기 크기를 통해서 선언하는 방법?
			 		new 데이터유형[크기];
			 		참조변수.length
			 3. 초기값에 할당된 내용
			 4. index란 무엇인가? 
			 	index를 통해서 할당 및 호출
			 		배열명[0] : 저장/호출
			 * */
			System.out.println("배열의 크기:"+intArry.length);
			//length는 배열의 갯수/크기를 알려줌
			//자바에서 배열의 선언과 바로 데이터 할당(java만 해당)
			int pts2[] = {70,80,90};	
			//[70,80,90] 대부분 프로그램은 []로 할당하지만 자바는 {}로 할당
			int pts3[];		//선언
			pts3 = new int[] {80,90,100};	// 초기화
//			pts3 = {90,100,70}; 	... 에러발생
			//선언후, 할당시 new 데이텨유형[] 으로 해야함.
			System.out.println(pts3[0]);
			System.out.println(pts3[1]);
			System.out.println(pts3[2]);
			
			//ex1) double형으로 선언과 초기화를 바로 처리하는 배열 3개 처리
			double [] dbl2 = {1.5,2.7,3.9};
//			double dbl2[] = {1.5,2.7,3.9}; ==> []를 변수 이름 앞,뒤로 넣어도 동일한 결과를 나타냄
			System.out.println(dbl2[0]);
			System.out.println(dbl2[1]);
			System.out.println(dbl2[2]);
			
			//ex2) boolean형으로 선언과 초기화를 바로 처리하는 배열 5개 처리
			boolean [] bl;
			bl = new boolean[] {1<2,3==3,5>=8,3>=2,5!=5};
			bl[1] = true; //특정한 값 변경
			System.out.println(bl[0]);
			System.out.println(bl[1]);
			System.out.println(bl[2]);
			System.out.println(bl[3]);
			System.out.println(bl[4]);
			
	}

}
