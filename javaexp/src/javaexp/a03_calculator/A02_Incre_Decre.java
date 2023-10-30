package javaexp.a03_calculator;

public class A02_Incre_Decre {

	public static void main(String[] args) {
		/*
		 # 증감연산자
		 1. 기본 : 1씩 증가/감소 처리
		 	++변수 : 증가하고 해당 라인에 표시
		 	변수++ : 해당라인에 표시하고 다음에 증가
		 	--변수 : 감소하고 해당라인에 표시
		 	변수-- : 해당 라인에 표시하고 감소
		
		 * */
		int no = 0; // [0]
		System.out.println(++no); // 증가시킨 후 출력 [1]
		System.out.println(++no); // [2]
		System.out.println(++no); // [3]
		System.out.println(no++); // [3]이란 데이터가 할당이 되있는 상태임. 
									//출력한 다음에 증가.. ;에서는 증가하여 4임
		System.out.println(no++); // 출력 [4]하고 증가 [5] ..증가후 출력 없으므로 4로 나오지만 최종값은 5임
		System.out.println(no++); // 출력 [5]하고 증가 [6]
		System.out.println(--no); // 감소 [5]하고 출력 
		System.out.println(--no); // 감소 [4]하고 출력 
		System.out.println(--no); // 감소 [3]하고 출력 
		System.out.println(no--); // 출력 [3]하고 감소[2]
		System.out.println(no--); // 출력 [2]하고 감소[1]
		System.out.println(no--); // 출력 [1]하고 감소[0]
		System.out.println("최종데이터는 : " + no);
		
		System.out.println("----------------");
		
		
//		 # 누적연산자
//		 1. 2개이상 증가/감소 할 때 
		int no2 = 0;
		int no3,no4,no5; //정수형으로 no3,no4,no5 선언
		no3 = no4 = no5 = 7;
		
		// 연산식은 왼쪽에서 오른쪽으로 흐름/위에서 아래 
		// ex) no2 = no2 + 2; -> no2 + 2에 해당
		// 단, 대입연산자는 오른쪽에서 왼쪽으로 대입된다.
		// ex) int no2 = 0; -> 0을 no2에 대입한다에 해당
		
		no2 = no2 + 2;
		no2 = no2 + 2;
		no2 = no2 + 2;
		System.out.println(no2);
		
		no2 +=2; // 위 연산식과 동일한 결과를 처리한다...+=2 씩 증가 위의 no2 = no2 + 2;와 같은 수식임
		System.out.println("최종 결과값 : " + no2);
		no2 +=5;
		System.out.println("최종 결과값 : " + no2);
		no2 +=5;
		System.out.println("최종 결과값 : " + no2);
		no2 +=5;
		System.out.println("최종 결과값 : " + no2);
		no2 +=5;
		System.out.println("최종 결과값 : " + no2);
		no2 +=5;
		System.out.println("최종 결과값 : " + no2);
		
	System.out.println("-------------");	

	 	//ex1) no3을 초기값을 0으로 설정하고, 3씩 3번 증가한 값을 출력하세요
		//ex2) no4를 초기값을 10으로 설정하고, 1씩 감소 5번한 내용을 출력하세요
		//ex3) no5를 초기값으로 100으로 설정하고, 2씩 5번 감소한 내용을 출력하세요
	
	//ex1)
	no3 = 0;
	no3 = no3 + 3;
	no3 *=3; //3번 증가므로 *3을 해준다
	System.out.println(no3);
	
	//ex2)
	no4 = 10;
	System.out.println(no4); no4--;
	System.out.println(no4); no4--;
	System.out.println(no4); no4--;
	System.out.println(no4); no4--;
	System.out.println(no4);
	System.out.println(--no4); //감소 후 출력
	
	//ex3)
	no5 = 100;
	System.out.println(no5); //100 출력
	System.out.println(no5-=2); 
	System.out.println(no5-=2);
	System.out.println(no5-=2);
	System.out.println(no5-=2);
	System.out.println(no5-=2);
	
	
	System.out.println("------------------------------------");
	
	int num01 = 1;
	
	System.out.println("# 사칙 누적 연산 #");
	System.out.println("num01*=2:"+(num01*=2));
	System.out.println("num01*=2:"+(num01*=2));
	System.out.println("num01*=2:"+(num01*=2));
	System.out.println("num01/=2:"+(num01/=2));
	System.out.println("num01/=2:"+(num01/=2));
	System.out.println("num01%=2:"+(num01%=2));
	System.out.println("num01%=2:"+(num01%=2));
	
	num01 = 2;
		 	
		 	
		 	
	}

}
