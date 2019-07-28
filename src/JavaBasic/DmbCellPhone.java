package JavaBasic;

public class DmbCellPhone extends Cellphone {
	//dmb 속성(필드)
	int ch;
	private int vol;
	

	//String model;//->parent로부터
	//String color;//->parent로부터
	
	//int freq;//dmb주파수
	//int maxCh;//최대채널수
	//int defCh;//디폴트채널
	//int consPow;//전력소모
	
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	//생성자
	DmbCellPhone(String model, String color, int ch){
		this.model = model;
		this.color = color;
		this.ch = ch;
	}
	DmbCellPhone(String model, String color, int ch, int vol){
		this.model = model;
		this.color = color;
		this.ch = ch;
		this.vol = vol;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널: " + ch + "DMB방송수신을 시작합니다");
	}
	void turnOffDmb() {
		System.out.println("DMB방송수신을 종료합니다");
	}
	void changeChDmb(int ch) {
		this.ch = ch;
		System.out.println("채널: " + ch + " 변경된 채널");
	}
	void changeVol(int vol) {
		this.vol = vol;
		System.out.println("볼륨: " + vol + " 음량조절");
	}
}
