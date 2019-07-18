package JavaBasic;

public class Truck extends Car {
	int capacity;
	Truck(){
		System.out.println("Truck() 생성");
	}
	final static String CAR_TYPE="2.5톤 트럭";
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	void upSpeed(int v) {
		this.speed += v; 
		if(this.speed >150) {
			this.speed=150;
			System.out.println("속도제한! " + this.speed);
		}
		
	}
	
}
