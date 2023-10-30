package javaexp.a06_objectview.vo;
// 사무실 정보(위치와 수용인원)
public class Office {
	private String location;
	private int capcity;
	
	public Office(String location, int capcity) {
		this.location = location;
		this.capcity = capcity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapcity() {
		return capcity;
	}
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	
	
}
