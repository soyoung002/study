package javaexp.a11_collection;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  	# 인터페이스 분류
  	* Collection
  		- List : 순서 유지 후 저장
  				 중복해서 객체 저장 가능
  				 
  		- Set : 순서 유지 하지 않고 저장
  				중복 저장 불가
 
 	* 컬렉션 프레임윅
 		- 컬렉션 : 사전적 의미로 요소(객체)를 수집해 저장하는 것을 말한다.
 		- 배열의 문제점
 			1) 저장할 수 있는 객체 수가 배열을 생성할 때 결졍
 				==> 불특정 다수의 객체를 저장하는 문제
 			2) 객체 삭제 했을 때, 객체를 저장하는 문제 발생
 				==> 삭제하면 낱알 빠진 옥수수처럼 해당 내용만 null로 처리
 				==> 크기가 커지거나 작아지는 못하는 단점
 		- 동적 배열의 필요
 			1) 객체들을 효율적으로 추가,삭제,검색 할 수 있음
 			2) 인터페이스를 통해 정형화 된 방법으로 다양한 컬렉션 클래스 사용 및 확장하여 활용가능
 				ex) List<Person> plist1 = new ArrayList<Person>();
 				    List<Person> plist2 = new LinkedList<Person>();
 				    List<Person> plist3 = new Vector<Person>();
 				    
 	* 컬렉션 프레임웍의 주요 인터페이스
 		- 인터페이스의 실제 객체들
 			1) List 인터페이스 : 순서를 유지하고 중복 저장 가능
 							  인터 페이스를 상속 받아서 사용자 정의 실제 클래스를 정의가 가능
 							  => ArrayList, Vector, LinkedList
 				
 			2) Set 인터페이스  : 순서를 유지와 중복저장 모두 불가능
 							 => HashSet, TreeSet
 				
 			3) Map 인터페이스 : 키와 값의 쌍으로 저장, 키 중복저장 불가
 							=> HashMap, Hashtable, TreeMap, Properties
 							
 							Map<String, Member> memvers = new HashMap<String, Memver>();
 							members.put("himan",new Member("7777","홍길동",2500);
 							members.put("himan",new Member("7777","김길동",2500);
 							members.put("goodMan",new Member("7777","박길동",2500);
 							members.put("higirl",new Member("7777","최길동",2500);
 							
 							
 							
 	# Database	
 	 - primary key : 키로 설정한 컬럼은 row단위 해당 컬럼이 동일한 경우
 	 				 입력 자체가 되지 않기에 중복을 막아준다.
 	 				 
 	 				 ex) empno	 ename	 job
 	 			 	 	 10000 	 홍길동	 대리
 	 			 	 	 10001	 홍길동	 대리
 	 				 	 10002 	 홍길동	 대리
 	 				 	 10000	 홍길동	 대리(입력 자체가 되지 않음 -empno가 key일때)
 	 				 	 List<Emp> emplist = db.getEmpList();
 	 				 	 
 	 				 	 
 **/
		
		
		
		
	}

}
