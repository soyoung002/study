package javaexp.a06_object;

public class A04_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 생성자
		 1. 객체를 생성할 때, 클래스명과 동일한 함수명으로 선언하는 것을 생성자라고 한다.
		 2. 주요기능
		 	1) 객체를 생성할 때, 사용한다. ==> new 객체명()
		 	2) 일반적으로 필드를 초기화할 때, 사용한다.
		 		클래스에서 선언된 필드값에 데이터를 할당하여, 초기값을 설정할 필요가 있을 때 사용한다.
		 		
		 		ex) public Baby(String name) {
		 			this.name = name;
		 		}
		 		Baby b1 = new Baby("귀염아기");
		 		
		 3. 형태
		 	1) 기본 생성자
		 		클래스를 선언할 때, 생성자를 선언하지 않으면
		 		컴파일시 자동으로 public 클래스명(){} 생성자가 생성되어 사용할 수 있다.
		 	2) 그러나, 위 기본 생성자는 사용자 정의 생성자를
		 		선언하는 순간 사라져서, 컴파일시도 자동으로 추가되지 않는다.
		 	3) 추가 선언하는 생성자
		 		생성자는 기본 생성자와 같이 매개변수가 없는 생성자를
		 		비롯하여 매개변수 오버로딩 규칙(갯수,타입,순서)으로 여러 생성자를 선언할 수 있다.
		 	4) 생성자의 매개변수는 일반적으로 필드를 초기화하는 경우가 많아서 동일한 경우가 많다. 
		 		이때 매개변수와 필드를 구분하기 위하여 this.필드명 = 매개변수명; 으로 
		 		this를 사용한다.
		 	
		 * */
		
		//1.객체 생성
//		Mouse m01 = new Mouse();
		Mouse m02 = new Mouse("로지텍",20000);
		//2.필드 초기화 객체 생성
		System.out.println(m02.company);
		System.out.println(m02.price);		//==> 따로 출력
		
		
		
//ex) Product 물건/가격/갯수를 필드로 선언하고, 생성자를 통해서 할당하는 처리를 하고, 객체를 생성하여 필드를 출력하시오.
		Prodct p01=new Prodct("딸기",3000,3);	//객체생성
		Prodct p02=new Prodct("사과",1000,1);
		Prodct p03=new Prodct("바나나",2000,2);
		
		System.out.println(p01.name+p01.price+"원"+p01.cnt+"개");	//==>한번에 출력
		System.out.println(p02.name+p02.price+"원"+p02.cnt+"개");	
		System.out.println(p03.name+p03.price+"원"+p03.cnt+"개");	
		
		Dog d1=new Dog();	//생성자가 선언하지 않을 떄는 default 생성자가 컴파일시 자동생성되어 사용할 수 있다.
		
//		Room r1 = new Room();	==> 2. 오류남..default 생성자는 선언된 생성자가 있으면 사라지기 때문에 오류
		Room r2 = new Room("우리방"); //=> () 내용기입시 사용가능
		
//		
		Phone p1 = new Phone("아이폰",5000);	//50000을 앞으로 해야 오류안나는데 이유..
		Phone p2 = new Phone(100,"LG");	//
		Phone p3 = new Phone(600,"삼성");
		
		System.out.println("");
		
		
		
							
		}
	
	
	}



class Phone {
	String company;
	int price;	//==> 생성자 오버로딩 규칙
//						1. 매개변수의 갯수가 다르면 선언이 가능하다.
//	Phone(){}			==> 68,69줄 같은 내용이지만 매개변수 똑같아서 오류 하나만 선언 가능
	Phone(){}
	Phone(String company){	
		this.company = company;
	}
//	Phone(String company){	  	2. 매개변수의 갯수가 같더라도 타입이 다르면 가능하다.
//		this.company = company;		==> 위의 것과 갯수와 타입 모두 같아서 오류
	Phone(int price) {
		this.price=price;	//	3.매개변수의 개수가 같고, 타입이 같더라도 타입의 순서를 다르게 하면 가능하다.
	}
	Phone(int price, String company) {		
		
		this.price=price;
		this.company=company;
	}										// Phone(String company, int price)도 순서가 다르기 때문에 가능
	Phone( String company,int price) {		//=> 위의 것과 순서 달라도 가능 
		this.price=price;
		this.company=company;
	}
}
class Room{
	public Room(String name) {}		//==> 1. default 생성자 선언시
	
}
class Dog{	// public Dog(){} ==> 디폴트 생성자
	
	
}
class Mouse{
	String company;
	int price;
//	Mouse(){}
	Mouse(String company, int price) {
		this.company = company;
		this.price = price;
	}
}
class Prodct{	//선언
	String name;
	int price;
	int cnt;
//	Prodct(){}
	Prodct(String name, int price, int cnt) {	//할당
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
}