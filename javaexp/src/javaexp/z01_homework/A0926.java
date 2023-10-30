package javaexp.z01_homework;

public class A0926 {

	public static void main(String[] args) {
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
		int arry[] = {1,2,3};			//정수형 배열 선언하여 바로 초기화
		System.out.println(arry[0]);	//초기화 0부터 되있으므로 012가 들어가야함 아니면 실행시 오류
		System.out.println(arry[1]);	
		System.out.println(arry[2]);
//		System.out.println(arry[3]);	==> 배열의 갯수가 3개이므로 3은 실행시 오류(초기화 0으로 되있어서 3개는 0,1,2로 3개)
		
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
//		배열은 같은 유형의 데이터 여러개를 하나의 메모리에 할당하여 처리.
//		기본데이터 유형을 배열을 통해 객체 처리 할 수 있으며,
//		나의 메모리에 할당하여 배열의 크기와 갯수를 처리 할 수 있다.
//		또한 index를 통해 저장 및 호출이 가능하다
		
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
		System.out.println("랜덤 주사위 5회 던지기");
		int dice[] = new int[5];	//dice에 5개의 정수형 배열을 만듬..5번 던질때까지 반복
		for(int idx=0;idx<dice.length;idx++) {	//반복문..dice의 배열 갯수는 5개이므로 12345
					//idx=dice를 사용시 idce를 idx에 할당하는 것이므로 사용하면 오류
			dice[idx] = (int)(Math.random()*6+1);
			System.out.println(idx+1+"번째 결과:"+dice[idx]);
		}
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
		int kor [] = new int[5];	//국어 점수는 5명걸 받기위해 5개의 배열 생성
		kor[0] = 100;				//초기값 0부터 시작이므로 0부터 5개는
		kor[1] = 90;				//0,1,2,3,4 ==> 5개 0~4로 해줘야함
		kor[2] = 80;
		kor[3] = 70;
		kor[4] = 60;	
		int tot=0;				//국어 점수 5명(배열5개)의 합산 변수 초기화
		
//		System.out.println(kor);	==> 배열의 주소값이 출력됨..
//										오류는 아니지만, 사용자가 나타내고자 하는 값을 출력하지 못함
		
		System.out.println("\n"+kor.length+"명의 점수와 총점");	
		//kor.length는 배열의 갯수를 나타내줌 5명(5개배열)을 나타낼것이므로 length를 사용 
		
		for(int idx=0; idx<kor.length; idx++) { 
			//반복문(배열이 5개지만 0부터 시작하므로..
			//[]첫번째는 0이므로 idx값을 0으로 해줘야함. 0,1,2,3,4 => 5개
			//kor[0] => 첫번째 배열...
			//idx=1로 초기화시 kor[0]이 인식되지 않음.
			//idx=kor은 kor을 idx에 할당하는거기 때문에 쓸 수 없음. <=또한 성립되지 않으므로 오류
			
			System.out.println(idx+1+"번째 학생들의 점수:"+kor[idx]+"점");	
			//kor[idx]를 붙이는 이유는 [idx]를 붙여줘야 kor에 할당 된 값을 출력한다.
			//할당된 값 ex) kor[0] = 100;
			tot+=kor[idx];
			//할당된 값을 idx(0~4)<kor(5)가 될때까지 반복한 값을 계속 더해서 tot에 할당
		}
		System.out.println("");
		
		int st[] = new int[30];  //30명의 학생을 추가하기위한 30개의 배열 생성
		int pt[] = new int[30]; // 30개의 점수 추가를 위한 30개의 배열생성

	        for (int idx = 0; idx < 30; idx++) {
	        	pt[idx] =(int) (Math.random() * 101); //배열 30개 생성
	            System.out.println(idx+1+"번째의 학생 점수:"+pt[idx]+"점");	
	            //length쓰면 고정되서 ++ 조건문으로 받으려하는 값은 해야할때 쓰면안된다.
	        }
		
		
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
//	        토론 조장에게 의견 제출 후 조장이 제출 
	}

}
