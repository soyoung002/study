package javaexp.z01_homework;

public class A1010 {

	public static void main(String[] args) {
		
		Student01 s1 = new Student01();	//같은 패키지안에 class Student로 선언된게 이미 있어서 01로 해줘서 오류 해결..
		s1.name = "박길동";
		s1.age = 13;
		s1.grade = 6;
		s1.introduce();
		
		Animal01 a1 = new Animal01();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		Student02 st01 = new Student02("최유리",12,5);
		System.out.println("상위에 있는 필드 접근:"+st01.grade);	//grade만 선언해서 5만 바뀜
	}
}		

//[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. 
//		Person 클래스는 name과 age를 필드로 가지고 있고, 
//		introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//		introduce() 메서드를 통해 학년도 함께 소개합니다.

		class Person 
		{
			String name;
			int age;
			void introduce() 
			{
				System.out.println("안녕 내 이름은 "+name+"이고 "+age+"살이야");
			}
		}
		class Student01 extends Person {
			int grade=6;
			void introduce() {
				super.introduce();
				System.out.println("안녕 내 이름은 "+name+"이고 "+age+"살 "+ grade +"학년이야");
			}
	}
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. 
//					Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		class Animal01{
			String sound="동물 울음 소리! ";
		}
		class Dog extends Animal01{
			String sound="멍멍!!";
			public Dog() {
				System.out.println(super.sound+"강아지는 "+sound);
			}
		}
		class Cat extends Animal01{
			String sound="야옹~~";
			public Cat() {
				System.out.println(super.sound+"고양이는 "+sound);
			}
		}
		
//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요.
//		Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
//      # 위 과제는 개인톡으로 전달부탁합니다.		
		//내가한거...하다맘
//		class Person01 extends Person{
//			public Person01(String name, int age) {
//				this.name=name;
//				this.age=age;
//			}
//		}
//		class Student02 extends Student01{
//			public Student02(int grade) {
//				this.grade=grade;
//			}
//			
//		}
//		선웅이가한거..비교해서보기
		class Student02 extends Person
		{
			int grade=1;
			public Student02(String name, int age, int grade) //상속
			{	
				this.name=name;
				this.age=age;
				this.grade=grade;
			}
			
		}
	
		



//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.

//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
		class Child001 {
			public Child001 () {}
		}
		class Parent extends Child001 {}
		
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.

//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.

//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.

		
