package javaexp.a06_object.vo;

public class Cpu {
	private String company;
	private String spec;
	public Cpu(String company, String spec) {
		this.company = company;
		this.spec = spec;
	}

	public String showInfo() {
		System.out.println("# CPU 정보 #");
		System.out.println("제조사:"+company);
		System.out.println("사양:"+spec);
		return company;
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}
	
}
