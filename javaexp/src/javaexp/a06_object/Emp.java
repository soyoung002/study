package javaexp.a06_object;

public class Emp {
		//기본속성(private : 외부접근 불가)
	private int empno;
	private String ename;
	private String job;
	private double salary;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	/**주소문
	 * @param empno
	 * @param ename
	 * @param job
	 * @param saleary
	 */
	public Emp(int emppno, String ename, String job, double saleary) { //전체 생성자가 들어가는 데이터를 만듦
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = saleary;
	}
	public void show() {
		System.out.print("사원번호:"+empno);
		System.out.print("사원명:"+ename);
		System.out.print("직책명:"+job);
		System.out.print("급여:"+salary);
	}
	public int getEmppno() {
		return empno;
	}
	public void setEmppno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSaleary(double salary) {
		this.salary = salary;
	}
	
	//메인 없이 작성 후....
	

}
