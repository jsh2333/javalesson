package JavaBasic;

public class Car {
	protected int wheel;
	String Color;
	int speed;
	
	Tire[] tires = {
			new Tire("앞-왼쪽", 6),
			new Tire("앞-오른쪽", 5),
			new Tire("뒤-오른쪽", 4),
			new Tire("뒤-왼쪽", 3)
	};
	
	Tire frontLeftTire = new Tire("앞-왼쪽", 6);
	Tire frontRightTire = new Tire("앞-오른쪽", 5);
	Tire backRightTire = new Tire("뒤-오른쪽", 4);
	Tire backLeftTire = new Tire("뒤-왼쪽", 3);
	
	
	int run() {
		
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		
		return 0;
	}

	int run2() {

		System.out.println("자동차 주행");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}
	
	private void stop() {
		System.out.println("자동차 정지");
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	static private int count = 0;
	
	
	public Car(){
		System.out.println("Car() 생성");
		count++;
	}
	
	public static int getCount() { // 클래스메소드 (static 붙어있는 클래스의 메소드)
		return count;
		
	}
	//-----------------------------
	void upSpeed(int v) {
		this.speed += v; 
	}
	
	void downSpeed(int v) {
		this.speed -= v;
	}
	
}
