package javaexp.a06_object;

public class A05_ConstructorParam {
	/*
	# 매개변수의 선언과 활용
	1. 생성자와 메서드는 해당하는 이름과 함께 매개변수로 선언하여
		식별한다.
	2. 매개변수는 특정한 객체에 데이터를 입력할 때, 사용하는 형태이다.
	3. 매개변수의 type(유형)에 맞게 호출하여야 한다.
		즉, 해당 데이터유형을 입력이 가능하는 매개변수를 선언하고 
		호출하여야 한다.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ParamExp();
//		new ParamExp(5); // String str = 5; (X)
		new ParamExp("홍길동"); // String str = "홍길동";
		new ParamExp(25); // int num01 = 25;
		// ex) class ParamExp2 로 선언하고, 매개변수가 없는 것 
		//  	문자열데이터 할당, 정수형데이터할당, 실수형데이터 할당
		//      생성자를 선언하고 호출하세요.
		new ParamExp2();
		new ParamExp2("안녕맨");
		new ParamExp2(3000);
		new ParamExp2(40.125);
		new ParamExp2("홍길동",25);
		new ParamExp2(25, "홍길동");
		// 전달시, 구분해서 넘길 수 있을 때, 선언이 가능하다.
		Person01 p01 = new Person01();
		System.out.println("이름:"+p01.name);
		System.out.println("나이:"+p01.age);
		System.out.println("사는곳:"+p01.loc);
		Person01 p02 = new Person01("홍길동",35);
		System.out.println("# 매개변수2(이름,나이)#");
		System.out.println(p02.name);
		System.out.println(p02.age);
		Person01 p03 = new Person01("마길동",27,"서울");
		System.out.println(p03.name);
		System.out.println(p03.age);
		System.out.println(p03.loc);
		// 주의) 객체로 생성하는 순간
		Product01 pr01 = new Product01();
		System.out.println(pr01);
		// String과 같이 객체의 경우 heap메모리에 할당되지
		// 않는 경우 default값이 null
		System.out.println(pr01.name);
		// 숫자형의 경우 객체는 default로 0이 할당이 된다.
		System.out.println(pr01.price);
		System.out.println(pr01.cnt);
		System.out.println(pr01.discount);
		// main()에서 쓰는 데이터는 초기화를 하여야
		// 사용이 가능하다.
		String name = null;
		System.out.println(name);
		int num01=0; // 지역변수는 초기화를 하여야 사용 가능하다.
		System.out.println(num01);
		// 객체에 종속된 변수는 객체 생성시 자동으로 초기화가 되어
		// 있기 때문에 바로 사용할 수 있다.
		Product01 pro03 = new Product01("사과",3000,2);
		System.out.println(pro03.name);
		System.out.println(pro03.price);
		System.out.println(pro03.cnt);
		
		
	}
}
// ex)  Product01 클래스에 필드로 물건명, 가격, 갯수를 선언하고
//      매개변수없는것(초기값선언), 매개변수1(물건), 매개변수1(가격)
//      매개변수3개(물건명, 가격, 갯수)로 선언하고 호출하게 하세요.
class Product01{
	String name;
	int price;
	int cnt;
	double discount;
	Product01(){
		name = "물건명없음"; 
		// null인 경우 의미 없음.. "" 경우에는 공백문자가 들어간다;
		price = 0; // 의미없음. 자동 0으로 처리
		cnt = 1;
		discount = 1.2;
	}
	Product01(String name){
		this.name = name;
	}
	// new Product01(2000)
	Product01(int price){
		this.price = price;
	}
	/*
	price와 cnt로 이름은 구분되지만 실제 정수형으로
	선언되는 것으로 구분하기에 int을 정의하면 에러 발생..
	Product01(int cnt){
		this.cnt = cnt;
	}
	*/	
	Product01(String name, int cnt){
		this.name = name;
		this.cnt = cnt;
	}
	Product01(String name, int price, int cnt){
		this.name =name;
		this.price = price;
		this.cnt = cnt;
	}
	
}



// 동일한 package에서는 같은 이름의 클래스를 선언하지 못 한다.
class Person01{
	String name;
	int age;
	String loc;
	Person01(){
		// default 값 설정 처리..
		name = "무명";
		age = 1;
		loc = "거주지 없음";
	}
	Person01(String name){
		this.name = name;
	}
	Person01(int age){
		this.age = age;
	}
	Person01(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person01(String name, int age, String loc){
		this.name = name;
		this.age = age;
		this.loc = loc;
		System.out.println("# 매개변수 3개 생성 이름, 나이, 사는곳#");
		
	}
}


class ParamExp2{
	ParamExp2(){
		System.out.println("매개변수가 없음");
	}
	ParamExp2(String str){
		System.out.println("문자열1개:"+str);
	}
	ParamExp2(int num01){
		System.out.println("정수형1개:"+num01);
	}
	ParamExp2(double num02){
		System.out.println("실수형1개:"+num02);
	}
	ParamExp2(String name, int age){
		System.out.println("# 매개변수 2개#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
	ParamExp2(int age,String name){
		System.out.println("# 매개변수 2개(순서변경)#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}	
}
class ParamExp{
	ParamExp(){
		System.out.println("매개변수가 없음.");
	}
	// 생성 오버로딩 규칙에 의해서 여러가지 매개변수 추가 선언
	ParamExp(String str){
		System.out.println("문자열 1개 입력:"+str);
	}
	ParamExp(int num01){
		System.out.println("정수형 1개 입력:"+num01);
	}
}







