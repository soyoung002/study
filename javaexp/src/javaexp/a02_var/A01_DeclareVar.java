package javaexp.a02_var;

// class 클래스명 : 영문 대문자로 시작(단어별로 대문자 후 소문자로 끊어주기)
public class A01_DeclareVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 변수의 선언.
		 1. 기본 형식 
		 	1) 선언 : 데이터 유형 + 변수명;
		 		ex) int num01;
		 	2) 할당 : 변수명 = 데이터 
		 		ex) num01 = 25;
		 	3) 활용하기(선언+할당)
		 		출력 System.out.println(변수명)
		 		데이터변수에 할당 및 연산 : 다른 변수명 = 변수명 + 25;
		 		ex) int num02 = num01 + 25;
		 2. 응용(복합)
		 	1) 선언 + 할당
		 		데이터 유형 변수명 = 데이터;
		 		ex) int num02 = 30;
		 	2) 선언 + 할당 대입
		 	데이터유형 변수명 = 변수명 + 데이터;
		3. 주의(에러발생)
			1) 변수는 기본적으로 초기화하지 않으면 사용(활용)할 수 없다.
				즉, 최소한 데이터를 할당한 후에 사용해야함.
				선언으로 사용할 수 없다.
				int num01;
				System.out.println(num01); ... X
				int num02 = num 01 + 25;   ... X
		 */
		//숫자형 데이터의 기본 데이터인 정수형 데이터 선언
		int num01; //선언
		num01 = 25; //할당
		System.out.println(num01); //출력
		
		int num02 = num01 + 25; //다른 변수에 재할당
		System.out.println(num02); //재할당 한 값을 다른 변수에 출력
		
		System.out.println("-----------------");
		
		//출력시, +(연결)을 통해서 문자열과 함께 출력 가능
		System.out.println("첫번째 정수 : " + num01);
		System.out.println("두번째 정수 : " + num02);
		
		System.out.println("-----------------");
		
		// 물건의 가격을 선언/할당 분리하고,
		// 물건의 갯수는 선운 + 할당 동시에 하여,
		// 물건의 가격 : @@
		// 물건의 갯수 : @@
		// 형식으로 출력되게 하시오
		
		int price = 1; //변수 선언
		price = 1000; //변수 할당
		
		int cnt = 2; //선운 + 할당 동시에
		
		System.out.println("물건의 가격 : " + price + "원");
		System.out.println("물건의 갯수 : " + cnt + "개");
		
		int tot = price * cnt;
		System.out.println("물건의 가격 총 계 : " + tot + "원");
		
		/*
		 # 변수명의 선언과 규칙
		 1. 필수(에러 발생)
		 	1)반드시 숫자가 아닌 문자로 시작해야함.
		 		ex) int 25num01 ... X
		 			int num01; 	... O
		 	2)공백을 포함해선 안된다.
		 		ex) int num 01 ... X
		 	3)특수문자는 $, _만 선언 가능하고 다른 특수문자는 사용 할 수 없다.
		 		ex) int $num01 = 25; ... O
		 			int num01# = 30; ... x
		 			int set_num = 40; ... O
		 	4) 대소문자는 구분한다.
		 		ex) int num01 = 30;
		 		ex) int Num01 = 50;
		 			n/N은 다르므로 각각의 다른 변수로 인식함.
		 	5) 미리 지정된 예약어를 변수로 사용 할 수 없다.
		 		ex) int break = 50; ... X
		 			int for = 30; ... X
		 		예약어를 피하기 위해 변수명 + 01 등으로 numbering을 처리하는 경우도 있다.
		 		ex) int break01 = 50;
		 			int for01 = 30;
		 	6) 이전에 선언된 변수는 다시 선언시, 에러발생
		 			int num01 = 30;
		 			int num01 = 50; ... X 위에 이미 선언했으므로 같은 변수명으로 선언시 에러 발생
		 			num01 = 35; ... O		 			
		 2. 가독성을 위해서 준수 할 내용(에러 발생하지 않음)
			1) 클래스명은 대문자로 시작한다(합성어일시..(4)처럼 대문자 시작 후 소문자 단어별로 끊어서 대문자 처리)
			2) 일반 변수명은 소문자로 시작한다.
			3) 상수(한번 할당하면 변하지 않는 수)는 대문자로 선언
				final int PI = 3.14; //PI라는 변수명을 전부 대문자로 선언함
			4) 합성어는 구분자로 _ 또는 구분 시작시 대문자로 처리한다.
			 ex) int num_age01 = 50;
			 	 int numAge01 = 25;
		 */
//		int 25num; ...에러발생/문자가 아닌 숫자를 먼저 선언
//		int 30num = 30; ..에러발생/문자가 아닌 숫자를 먼저 선언
//		int num age = 30; ..에러발생/띄어쓰기 포함
		int $tot = 50;
//		int #sum = 20; ...에러발생/특수문자 $, _만 사용 가능
		int if10 = 27;
		int num03 = 40;
//		int num03 = 50; ..에러발생/이미 선언한 변수 재선언하여 에러발생
		num03 = 21;
		
		System.out.println("--------------------------");
		
		// ex) 국어, 영어, 수학 점수를 선언과 할당하고,
		//		총점(+), 평균(/) 연산자를 활용해서 촐점과
		//		평균을 출력하세요.
		
		int kor = 100;
		int eng = 90;
		int math = 70;
		
		int tot2 = kor + eng + math;
		
		System.out.println(" # 학생의 성적 #");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		System.out.println("총점 : " + tot2 + "점");
		System.out.println("평균 : " + tot2 / 3 + "점" + "(" + tot2 / 3.0 + "점)");
		
		
		System.out.println("-----------------------");
		/*
		 # var 변수 사용
		 1. 자바 10 이후에는 var변수로 데이터가 할당 된 후,
		 	데이터 유형이 정해지게 처리함.
		 */		
		var num10 = 25;
		var str01 = "안녕";
		System.out.println("num01 : " + num10);
		System.out.println("str01 : " + str01);
		
		System.out.println("-----------------");
		
		/*
		 # 문자열 데이터 처리
		 1. 문자열(문자의 배열) 데이터는 일반적으로 많이 사용하는
		 문자 데이터 처리를 위한 것이다.
		 배열이기에 객체개념이 포함해서 기본 데이터유형에는 포함되지 않는다.
		 2. 다만, 아래와 같이 선언하여 사용하는 것을 확인할 수 있다.
		 String str01 = "문자열1"
		 
		 * */
		
		String str02 = "홍길동";
		var name01 = "사과";
		System.out.println("이름 : " + str02);
		System.out.println("과일명 : " + name01);
		
		System.out.println("-----------------");
		
		// ex1) 다음의 변수를 선언하고 초기화 처리
		// 1 정수형 변수 age에 25를 할당하세요.
		// 2 문자열 변수 name "John"을 할당하세요.
		// 3 문자열 변수 greetin에 "Hello, "를 할당하고,
		// 4 문자열 변수 person에 "Alice"를 할당하세요.
		// 5 두 변수를 사용하여 "Hello, Alice"라는 메세지를 출력하는 코드를 작성하세요 (+) 활용
		
		int age = 25; //1
		String name = "John"; //2 String 또는 var 사용 가능
		String greetin = "Hello, "; //3  이하 동일
		String person = "Alice" ; //4 이하 동일
		
		System.out.println(greetin + person); //5
		
		
		System.out.println("-----------------");
		
		/*
		# 여러변수를 한번에 초기화 처리
		 * */
		
		int no1, no2, no3, no4, no5;	//변수선언
		no1=no2=no3=no4=no5=0;			//초기화
		
		//여러 변수를 한번에 선언과 동시에 초기하 처리
		
		
	
		

	}

}
