package javaexp.a06_object.vo;

public class Bank {
//		    - 필드: 계좌번호, 예금주, 잔액
//		    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
//		    - 메서드: 입금, 출금, 잔액 확인
		private String number;
		private String name;
		private int amount;
		public Bank(String number, String name) { //int amount 생략 가능:int amount = 0; 는 
//													상수이므로 매개변수와 다르기때문에 생략한거고 생략 안하고 기입해도 어차피 서로 다른거임
			this.number=number;
			this.name=name; //class의 오브젝트마다 this는 고유한 값을 받는다
//							만약 매개변수의 이름과 멤버변수의 이름이 다르다면
//							굳이 this사용할 필요없다
//							ex) this.name=name;==>멤버변수(=멤버,필드)=매개변수
			this.amount=0; //잔액을 0으로 초기화.. 이걸 0으로하란거임
		}
//		public void bankInfo() {
//			System.out.println("\n# 계좌 정보 #");
//			System.out.println("계좌번호:"+number);
//			System.out.println("예금주:"+name);
//			System.out.println("잔액:"+amount);
//		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmonut(int amount) {
			this.amount = amount;
		}
		
		
	}


