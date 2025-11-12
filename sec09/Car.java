package ch06.sec09;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model=model;
	}//인스턴스 멤버는 객체를 생성해야 사용 가능
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.printlm(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
	}
	

}
