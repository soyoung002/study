package javaexp.a05_array;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 # 객체형태의 메모리 구조
		 1. 배열부터는 객체로 포함되어 stack영역과 heap영역을 둘 다 활용한다.
		 2. 즉, heap영역에 실제 객체의 메모리를 사용하고, stack영역에서는 heap영역의 주소값을 저장해서 가지고 있다.
		  	==> 도서관에서 도서를 찾는 단말기에 도서의 위치가 어디있는지 나옴 -> heap 
		  	==> 도서의 위치 자료를 모아 필요할때만 위치의 내용이 찾을수 있도록 -> stack
		 3. 객체의 선언과 할당.
		 	1) 객체는 new 키워드나 객체 생성 설정으로 참조(heap영역 참조)변수로 선언하여 할당한다
		 4. 배열 객체의 사용 단계
		 	1) 변수선언
		 		변수타입[] 배열명;
		 	2) 배열선언과 할당
		 		배열명 = new 변수타입[배열의 갯수];
		 		현재 단계까지는 배열에 default 데이터만 할당된 상태 
		 		==> int[]의 경우 0이 각 구성요소에 할당
		 			String[]의 경우 null이 할당 ...객체에는 null이 할당
		 			double[]의 경우 0.0이 각 구성요소에 할당
		 	3) 각 구성요소 데이터 할당
		 		배열명[index번호] = 데이터;
		 		index번호 : 0부터 시작하는 index번호에 실제 사용할 데이터를 할당한다.
		 		==> ex) int[] arry = new int[3];
		 			arry[0] = 5;
		 			arry[0] = 10;
		 			arry[0] = 15;
		 			arry : 배열의heap영역 주소값 할당
		 			arry[0] = 5; 각 구성요소에 실제 데이터 할당
		 	4) 배열의 선언 + 초기값 할당 처리
		 		double[]arry = {10.7, 20.5, 30.17};
		 		이와 같이 선언과 동시에 0.0이외에 초기값을 할당하는 처리를 한번에 할 수 있다.
		 		arry : heap영역 주소값
		 		arry[0] : 첫번째 데이터 0.7 할당되어 있음..
		 * */
		
		int intAarry[];			//배열 선언
		intAarry = new int[5];	//배열의 초기값이 할당된 heap영역선언
		System.out.println("int형 배열의 참조변수:"+intAarry);
//		{I@58ceff1 	[I:정수형배열
//					58ceff1 : 16진수로 heap영역의 주소
		
		System.out.println(intAarry[0]);
		System.out.println(intAarry[1]);
		System.out.println(intAarry[2]);
		System.out.println(intAarry[3]);
		System.out.println(intAarry[4]);
		
		
//		ex) long형 3개짜리 배열을 선언/생성 참조변수 호출, 첫번째 데이터 출력
		long[] larry = new long[3];	//3개짜리배열
		System.out.println("long참조변수:"+larry);
		System.out.println(larry[0]);	//1번째 데이터 출력..0부터 시작이라 0이 첫번째
		
		
		
//		ex) double형 5개짜리 배열을 선언/생성 참조변수 호출, 두번째 데이터 출력
		double[] darry=new double[5];
		System.out.println("double참조변수:"+darry);
		System.out.println(darry[1]);
		
		
//		ex) String형 3개짜리 배열을 선언 1번째 데이터 출력
		String[] sarry = new String[3];
		System.out.println("String참조변수:"+sarry[0]);

	}

}
