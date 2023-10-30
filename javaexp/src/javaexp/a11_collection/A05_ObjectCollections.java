package javaexp.a11_collection;

import java.util.ArrayList;
import java.util.List;

import javaexp.a11_collection.vo.Person;
import javaexp.a11_collection.vo.Student;

public class A05_ObjectCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 # 객체형 Collection 활용
		 	1. 자바의 클래스를 만들어서 단위 객체를 사용할 수 있게 하고,
		 		이것을 Collection에 활용하는 형태로
		 	2. 실무적으로 활용도가 높다.
		 # 처리 순서
		 	1. class 선언
		 		컬렉션에 넣을 단위 내용을 VO클래스로 선언한다.
		 	2. List/Map에 할당하여 처리하기 생성자나 메서드를 통ㅇ해서 데이터를 넣은 컬렉션을 만듦
		 	3. 반복문을 통해서 개별 단위 객체를 가지고 오고,
		 		해당 속성들을 getXXX()에 의해서 로딩 및 활용한다.
		 	
		 		
		 		ex) 학생정보(이름/국어/영어/수학)
		 * */
				List<Student> studs = new ArrayList<Student>();
				studs.add(new Student("홍길동",70,80,90));
				studs.add(new Student("김길동",80,80,95));
				studs.add(new Student("신길동",90,85,80));
				
				System.out.println("이름\t국어\t영어\t수학");
//				studs.get(0)==new Student("홍길동",70,80,90);
				
				for(Student st:studs) {
					System.out.print(st.getName()+"\t");
					System.out.print(st.getKor()+"\t");
					System.out.print(st.getEng()+"\t");
					System.out.print(st.getMath()+"\n");
				}
				
				List<String> stList = new ArrayList<String>();
				stList.add("사과");
				stList.add("바나나");
				
				/*
				# new String("사과") 또는 data="사과"
				
				 String data = "사과"
				 System.out.println(fruit);
					==> 참조변수는 클래스 내에 ]
						toString()으로 정의된 내용을 출력한다.
				
				class String{
					private String str;
					String(String str){
						this.str=str;
					}
					String toString(){
						return str;
					}
				}
				class Object{	//대부분의 객체
					String toString() {
						return 패키지명.클래스명@heap주소값;
					}
				}
				*/
				
				System.out.println("# 단일 String #");
				System.out.println(stList.get(0));
				
				System.out.println("# 단일 객체 #");
				
				Student stu = new Student();
				System.out.println("주소값:"+stu);
				
				System.out.println(studs.get(0));
				
		
	/*
	 # 참조 변수를 호출 했을 때, 
	   특정하게 원하는 형식으로 데이터를 가져오고 싶은 경우
	   ==> overriding(기존된 선언된 내용을 재정의)
	 
	 */
				
				
				
				
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//ex) 기본 단위정보를 Person으로 사람의 이름,나이,사는 곳으로 하여
		//		해당 Person 3명의 정보를 위 List<Person>으로 처리하여 출력하세요
		
				List<Person> st = new ArrayList<Person>();
				st.add(new Person("신짱구", 20, "서울"));
				st.add(new Person("김철수", 21, "울산"));
				st.add(new Person("최유리", 22, "부산"));
				System.out.println("이름\t나이\t사는곳");
				for(Person st2:st) {
					System.out.print(st2.getName()+"\t");
					System.out.print(st2.getAge()+"\t");
					System.out.print(st2.getAd()+"\n");
				}
	}		

}
