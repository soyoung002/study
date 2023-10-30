package javaexp.a03_calculator;

public class A05_TripleCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 삼항연산자 
		  1. 앞에서 배운 여러가지 연산식은 데이터의 처리에 있어서, 어떤 데이터를 연산을 하고 대입/비교/논리식을 처리해준다. 
		  2. 그러나, 그 결과에 대한 구체적인 데이터로 변화는 하지 못하는 것이 특징이다. 
		  3. 예를 들어, 4는 홀/짝 수이다. 임의의 수에 의해 나타난 데이터에 따라 
		 	 가위/바위/보 등의 데이터 결과를 매칭시켜주는 처리를 말한다. 
		  4. 이러한 처리는 이후에 배우게 될 조건문에서 주로 처리할 수 있다. 
		  5. 하지만 삼항연산자를 이용하면 조건문을 처리하지 않더라도, 
		  간단하게 데이터를 어떤 비교/논리 연산식에 의해서 결과값을 가지고 올 수 있다. 
		  6. 삼항연산자 형식 
			1) (조건/논리)?결과1:결과2 
		  	2) 위와 같이 특정 조건에 ture/false에 따라,
		  		결과1인 경우 true일 때, 처리할 데이터 결과2는 false일 때 처리할 데이터로 나뉘어서 
		  		조건문 형식을 거치지 않더라도 데이터를 원하는 형식으로 처리할 수 있다.
		  	3) 중급이상 : 3개이상 조건데이터 처리
		  		조건1?결과1:(조건2?결과2:(조건3?결과4:결과5))
		 
		 */
//		int rNum = (int)(Math.random()*10+1); //1~10까지의 임의의 수
//		String result = rNum%2==0?"짝수":"홀수"; //2로 나누었을때 나머지가 0인것을 짝수 아닌것은 홀수
//		System.out.println("임의의수:"+rNum);
//		System.out.println("결과:"+result);
//		
//		String result2 = rNum%3==0?"3의 배수":"3의 배수아님";
//		System.out.println("결과:"+result2);
//		String id = "himan";
//		String pass = "7777";
//		String loginRst = id.equals("himan") && pass.equals("7777")?"로그인성공":"로그인실패";
//		System.out.println("로그인결과:" + loginRst);
//		
//		System.out.println("-----------------------");

		// ex)주사위를 던진 결과가 team01에 할당하고,
		// 4이상 나오면 게임에서 승리한다고 할 때, 승리와 패배를 나누어서 출력해보세요.

		int team01 = (int) (Math.random() * 6 + 1); // 1~6까지 범위이고 1부터 시작하는 랜덤 숫자 형성
		System.out.println("주사위 결과 값:" + team01); // 결과값 출력
		System.out.println("결과:" + (team01 >= 4 ? "승리" : "패배")); // 4랑 같거나 클시 승리 아닐시 패배

		/*
		 * ex. 0,1,2를 나오게 해서 0(가위), 1(바위), 2(보)를 출력 처리 (조건1)?처리1:(조건2?처리2:처리3) ...참일때
		 * 처리1 아닐시 처리2 (pt==0)?"가위":(pt==1?"바위":"보")
		 */

		int game01 = (int) (Math.random() * 3); // 3개의 숫자 랜덤 0,1,2 ->3개
		System.out.println(" # 랜덤 가위바위보 # ");
		System.out.println("나온 수:" + game01);
		System.out.println(game01==0?"가위":(game01==1?"바위":"보"));

	}

}
