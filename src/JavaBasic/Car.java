package JavaBasic;

public class Car {
	protected int wheel;
	String Color;
	int speed;
	
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
