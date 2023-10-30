package javaexp.z01_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javaexp.a11_collection.vo.Person;

public class A1018 {

	public static void main(String[] args) {
		
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//		기본 데이터 유형을 제공되는 메서드를 이용하여 여러가지 데이터 유형으로 변경,치환 처리하기 위해서.
//		byte => Byte
//		char => Character
//	 	int => Integer
//	 	double => Double
//	 	boolean => Boolean
//		
		
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.

		
		
		
		
		
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
			Random r = new Random();
			int st1 = r.nextInt(101)+0;
			int st2 = r.nextInt(101)+0;
			int st3 = r.nextInt(101)+0;
			System.out.println("# 학생 3명의 점수 #\n<이름>\t<점수>\n"+
								"김철수\t"+st1+"점\n"+"최유리\t"+st2+"점\n"
								+"신짱구\t"+st3+"점");
			System.out.println("# 성적 중 최저/고점 #\n"+
								"최고점 : "+Math.max(st1,(Math.max(st2,st3)))+"점");
			System.out.println("최저점 : "+Math.min(st1,(Math.min(st2,st3)))+"점");
		
		
		
//			[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.

			
			
//			[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.

			
			
//			[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.

			
			
			
//			[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.

			
			
//			[1단계:확인] 8. Map을 이용하여 key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				Map<String, Integer> map = new HashMap<String, Integer>();
				//String -> key Integer -> value
				map.put("1학년\t1반\t30번",80);
				map.put("1학년\t1반\t31번",60);
				map.put("1학년\t1반\t32번",75);
				
				System.out.println("학년\t반\t번호\t점수");
				for(String st01:map.keySet()) {
					System.out.print(st01+"\t");
					System.out.println(map.get(st01)+"\t");
					
				}
			
			
//			[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
					List<Member> mb = new ArrayList<Member>();
					mb.add(new Member("sss20", "pass123" , "신짱구 ", "새싹회원" , 0));
					mb.add(new Member("kkk", "pass456" , "김철수", "정회원" , 100));
					mb.add(new Member("ccc22", "pass789" , "최유리" , "열심회원" , 1000));
					mb.add(new Member("sss23", "pass101" , "신맹구" , "최고회원" , 5000));
					mb.add(new Member("hhh24", "pass112" , "흰둥이" , "엘리트회원" , 10000));
				
					for(Member mb2:mb) {
						System.out.print(mb2.getId()+"\t");
						System.out.print(mb2.getPassword()+"\t");
						System.out.print(mb2.getName()+"\n");
						System.out.print(mb2.getUser()+"\n");
						System.out.print(mb2.getPoint()+"\n");
					}
				

				
	}	//main()
}//class A1018 

			class Member {
				
				private String id;
				private String password;
				private String name;
				private String user;
				private int point;
				
		
				public Member(String id, String password, String name, String user, int point) {
					this.id = id;
					this.password = password;
					this.name = name;
					this.user = user;
					this.point = point;
				}
		
				public String getId() {
					return id;
				}
		
				public void setId(String id) {
					this.id = id;
				}
		
				public String getPassword() {
					return password;
				}
		
				public void setPassword(String password) {
					this.password = password;
				}
		
				public String getName() {
					return name;
				}
		
				public void setName(String name) {
					this.name = name;
				}
		
				public String getUser() {
					return user;
				}
		
				public void setUser(String user) {
					user = user;
				}
		
				public int getPoint() {
					return point;
				}
		
				public void setPoint(int point) {
					this.point = point;
				}
				
				
				
				
				
				
			}