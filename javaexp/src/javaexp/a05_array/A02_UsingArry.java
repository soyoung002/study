package javaexp.a05_array;

public class A02_UsingArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 배열의 활용
		1. 배열을 index단위를 호출하거나 할당할 수 있다
			int[] iArry = new int[3];
			String[] arry = {"사과","바나나","딸기"};
			iArry[0] = 45;
			iArry[1] = 50;
			
			System.out.println(arry[0]);
			arry[1] = "오렌지"; ==> 바나나로 들어가있으나 오렌지로 바꿀수 있음
		
		2. 배열은 lengh 배열의 길이를 가져올 수 있다.
			iArry.length : 3
			
			
		3. 배열과 반복문
			1) for(int idx = 0; idx < 배열명.length;idx++) {
				배열명[idx]
			}
			★ idx < 배열명.length : 배열의 index와 배열의 길이가 정수형을 1 차이가 나기때문에 같거나 크다가 아닌 무조건 작다로해야함.
			 						==> idx<배열명.length // 꼭 <(미만)으로 표기해야한다.
			 						
			2) for(단위 객체:배열객체) {     //세미콜론 ; X | 콜론 : O
				배열 안에 있는 구성요소 하나씩 가져와서 처리 후, 다음 index를 가져온다.
			} 				*/
		String[] fruits = {"사과","바나나","딸기"};	//선언과 함께 바로 할당
		int[] fruPrices = new int[3];	//0으로 선언한 것을 다른 데이터로 할당
		fruPrices[0] = 2000;	//배열명[index]로 저장할 수 있다.
		fruPrices[1] = 4000;	
		fruPrices[2] = 12000;
//		fruPrices[3] = 5000;	==> 에러발생..배열의 크기보다 더 많은 index 호출
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruPrices[0]);
		System.out.println(fruPrices[1]);
		System.out.println(fruPrices[2]);
//		배열에 저장된 데이터 index를 호출하여 가져올 수 있다.
		System.out.println("과일들의 배열의 크기:"+fruits.length);
		System.out.println("과일가격 배열의 크기:"+fruPrices.length);
		
//		ex) 학생 3명의 학점 등급을 문자 'A','C','D'등으로 할당하였다.
//			배열에 할당하여 출력하세요.
		char[] stGrades = {'A','C','D'};
		System.out.println(stGrades[0]);
		System.out.println(stGrades[1]);
		System.out.println(stGrades[2]);
		
//		==> 학점 등급 문자 'A','B','C' -> ''표시이므로 char 
//			배열에 할당하여 출력 ... 배열=> [] 이고 []에 할당하여 출력
		char[] stGrades2 = {'A','B','C'}; //선언과 함께 바로 할당
		System.out.println(stGrades2[0]); //출력
		System.out.println(stGrades2[1]);
		System.out.println(stGrades2[2]);
		
		
//		ex) 회원의 몸무게를 소숫점 1자리까지 저장하게, 
//		5명을 배열로 초기선언한 index로 접근하여 할당하고 출력하세요
		double[] weigths = new double[5];	//소숫점 출력을 위한 double, 5명 배열 초기선언
		weigths[0] = 48.5;
		weigths[1] = 50.7;
		weigths[2] = 55.6;
		weigths[3] = 56.1;
		weigths[4] = 60.5;
		System.out.println("몸무게 배열의 갯수:"+weigths.length);		//베열 출력시 변수명.length
//		배열과  mapping된 for문 처리
//		int idx=0 : 배열의 시작 index
//		idx<weights.length : 배열의 한계치 범위 index는 크기보다 작다
//		idx++ : 배열의 증가 처리
//		weights[idx] : 배열의 구성요소 접근 처리
		for(int idx=0;idx<weigths.length;idx++) {
			System.out.println(idx+"번째 몸무게");
			System.out.println(weigths[idx]+"kg");
		}
		
		
		
//		회원의 몸무게를 소숫점 2자리까지 저장하고 3명을 배열로 초기선언한 index로 접근하여 할당하고 출력하시오
//		double -> 실수 
		double[] weigths2 = new double[3];
		weigths2[0] = 45.55;
		weigths2[1] = 50.58;
		weigths2[2] = 65.77;
		System.out.print("몸무게2 배열 갯수"+weigths2.length);
		for(int idx=0;idx<weigths2.length;idx++) {
			System.out.print(idx+"번째 몸무게");
			System.out.println(weigths[idx]+"kg");
		}
		System.out.println();
		
		
//		ex) 회원 3명의 이름과 회원의 나이를 배열로 선언 할당 후, 반복문 for를 통해서 출력하세요..
//			번호		회원명	나이
//			 1		@@@		@@@
//			 2		@@@		@@@
//			 3		@@@		@@@
		String[] mnames = {"홍길동","김길동","정길동"};
		int []mages = {21,25,30};
		System.out.println("번호\t회원명\t회원나이");
		for(int idx=0;idx<mnames.length;idx++) {
			System.out.print(idx+1+"\t");
			System.out.print(mnames[idx]+"\t");
			System.out.print(mages[idx]+"\n");
		}
		System.out.println();
		
		
		
//		* for(단위:배열)
		System.out.println("# forEach 구문을 통한 배열데이터 #");
//		ex1) 위 mages를 for each 구문을 통해 출력하고,
//			전역변수를 활용하여 평균 나이를 출력하세요.
//		ex2) [알고리즘 문제]
//				전역변수 추가하고, 최대 나이 출력하세요.
			
		
		int tot = 0;	//총합
		int maxAge = 0;	//0부터 시작
		for(int age:mages) {
			tot+=age;
			if(age>maxAge) {	//age가 maxAge보다 크면 계속 반복
				maxAge = age;
			}
			System.out.println("나이:"+age);
		}
		System.out.println("나이의 평균:"+(tot/mages.length));
		System.out.println("최고령:"+maxAge);
			
		
		
//		영어의 알파벳 모음여부 출력하기
		char[] greets = {'H','e','l','l','o'};
//		* 모음 여부
		for(char c:greets) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println("[모음]");
			}
			System.out.println(c+",");
		}
//		* 대소문자 구분
//		for(char c:greets) {
//			if(c>=97&& c<=122);{
//				System.out.println("[소문자]");
//			}else{
//				System.out.println("[대문자]");
//			}
//			System.out.println(c+",");
//		}
		System.out.println();
		byte bytes[] = new byte[8];
		for(int idx=0;idx<bytes.length;idx++) {
			bytes[idx] = (byte)(Math.random()*90+33);
		}
//		* bytes[] ==> char[] ==> String
		String tmpPass = new String(bytes);
		System.out.println("임의의 비번:"+tmpPass);
////		* 33~122 ...총 갯수 :90
//		for(int code=15;code<=122;code++) {
//			System.out.println(code+":"+(char)code);
//		}
		
		
//		(int code=65; code<=120;code++) {
//			System.out.println(code+":"+(char)code);
//		}
//		
		
		
		
		
		
	}

}
