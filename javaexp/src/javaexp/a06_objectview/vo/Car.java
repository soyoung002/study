package javaexp.a06_objectview.vo;
//포함될 객체
public class Car {
	
	private String company;
	private String model;
	private int speed;
	
	public Car(String company, String model, int speed) {
		this.company = company;
		this.model = model;
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	

}
