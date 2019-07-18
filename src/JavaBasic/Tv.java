package JavaBasic;

public class Tv {
	//TV속성------------------
	String color;//색상
	boolean powerOn;//전원
	int ch;//채널
	float size;//화면크기
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getPowerOn() {
		return powerOn;
	}
	public boolean isPowerOn() {
		return powerOn;
	}
	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}

	
	//TV기능------------------
	void powerOn() {
		powerOn = !powerOn;//true->false->true->false->....
	};//TV 전원 온 오프
	void chUp() {
		System.out.println("chUp");
		ch++;
	};//채널 상향
	public void chDown() {
		System.out.println("chDown");
		ch--;
	};//채널 하향
	
	public Tv(){ // 생성자 initiator
		this.color = "red";
		this.powerOn = false;
		this.ch=9;
		this.size=32;//inch
	}
	Tv(float size){  //오버로딩 overloading 생성자
		this.color = "red";
		this.powerOn = false;
		this.ch=9;
		this.size = size;
	}
	public Tv(String color, float size){//오버로딩 overloading 생성자
		this.color = color;
		this.powerOn = false;
		this.ch=9;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Tv [color=" + color + ", powerOn=" + powerOn + ", ch=" + ch + ", size=" + size + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" 
				+ super.toString() + "]";
	}
	
}
