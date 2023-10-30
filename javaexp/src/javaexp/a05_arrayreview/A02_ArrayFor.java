package javaexp.a05_arrayreview;
import java.util.*;
public class A02_ArrayFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 배열과 반복문 처리
		 1. 배열의 속성..배열을 반복문을 통해 보다 효과적으로 사용할 수 있다.
		 	1) 배열의 길이 : 반복문의 한계치/반복조건
		 	2) 배열의 index : 반복문에서 사용할 변수
		 2. 기본 형식1
		 	
		 	for(int idx=0;idx<배열.length;idx++) {
		 		배열[idx]
		 	}
		 	
		 	(코드 풀이)
		 	int idx=0;		: 배열은 index가 0부터 처리함. 초기값 설정.
		 	idx<배열.length;	: 배열의 index는 배열의 크기보다 1작다.
		 					  !!주의!!	idx<=배열.length ...1작기 때문에 포함X 에러 발생
		 	idx++			: 배열의 index는 증가한다.
		 	배열[idx] 		: 배열은 index로 가져온다.
		 	*/
		
		//ex)Scanner를 통해서 과일 3개 정보를 입력하고, 출력하는 처리
		
//		String[] fruits = new String[3];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int idx=0;idx<fruits.length;idx++) {
//			System.out.println(idx+1+"번째 과일 정보를 입력");	//idx가 0부터 시작하므로 +1 해줘야 1번째부터 세는 문구 출력
//			fruits[idx] = sc.nextLine();
//		}
//		
//		System.out.println("# 배열에 등록된 과일 #");
//		
//		for(int idx = 0;idx<fruits.length;idx++) {
//			System.out.println(idx+1+")"+fruits[idx]);
//		}
		

		/* 3. 기본 형식 2
		 	forEach구문(사용할땐foreach)
		 		배열안에 있는 구성요소를 첫번째부터 1씩 가져와서 단위 데이터에 할당 후,
		 		다시 반복문을 돌면서 하나씩 가져와서 배열의 마지막 데이터까지 할당한 후,
		 		반복문이 중단되는 형태를 말한다.
		 		
		 		for(단위데이터 변수:배열){
		 		
		 		}
		 		
		  */
		//배열에 있는 데이터 갯수만큼 출력될때까지 반복
		System.out.println("# foreach구문의 통한 처리 #");
		String games[] = {"가위","바위","보"};
		for(String game:games) {
			System.out.println(game);
		}
		games[2] = "가위바위보"; //특정한 값 변경
		System.out.println(games[0]);
		System.out.println(games[1]);
		System.out.println(games[2]);
		
		
		//ex) 학생 5명의 점수를 선언하고, 출력하되, 총점과 평균을
		//	  for each 구문을 통해 처리하세요.
		//	  전역변수 int tot = 0; 활용
		System.out.println("# 학생 5명의 총점과 평균 #\n- 각 학생의 점수");
		int tot = 0;
		int pt[] = {100,90,80,70,60};
		for(int pt2:pt) {	 //지역변수를 쓴다는 느낌으로.. 오른쪽에 있는 배열을 가져온다고 이해하면 됨.
			tot+=pt2;
			System.out.println("  "+pt2+"점");	//각 학생들의 점수
					}
		System.out.println("- 총점:"+tot+"점");	//합계
		System.out.println("- 평균:"+tot/5+"점");	//평균
		System.out.println("- 평균:"+tot/pt.length+"점");	//pt.length로 배열 갯수(학생수)로 나눔
		
		
		
		
	}

}






