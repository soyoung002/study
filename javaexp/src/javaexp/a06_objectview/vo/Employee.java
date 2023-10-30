package javaexp.a06_objectview.vo;

public class Employee {

		// TODO Auto-generated method stub
		private String name;
		private int age;
		private Office office;
		
		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public void showMyOfficeInfo() {
			System.out.println("# 사원 정보 #");
			System.out.println("이름:"+name);
			System.out.println("나이:"+age);
			if(office!=null) {
				System.out.println("사무실 위치:"+office.getLocation());
				System.out.println("사무실 수용인원:"+office.getCapcity());
			}else {
				System.out.println("사무실이 아직 없습니다.");
			}
			System.out.println("==================");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setOffice(Office office) {
			// TODO Auto-generated method stub
			
		}
		
		
		
}
			
		
		
