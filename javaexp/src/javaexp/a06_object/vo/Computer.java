package javaexp.a06_object.vo;

public class Computer {
	private String kind;
	private Cpu cpu;	//사용할 객체를 필드에 지정
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	public Computer(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Cpu getCpu() {
		return cpu;
	}
	//부품인 cpu를 객체로 할당할 수 있게 처리
	public void setCpu(Cpu cpu) {	
		this.cpu = cpu;
	}
	public void show() {
		System.out.println("컴퓨터의 종류:"+kind);
		if(cpu!=null) {	//만약에..객체(Cpu)가 할당이 되있을시
			cpu.showInfo();
		}else {	//객체(Cpu)가 할당되어있지 않을시
			System.out.println("현재 컴퓨터에는 CPU가 없습니다.");
			
		}
		
		
	}
	
}
