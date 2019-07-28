package JavaBasic;

public class Cellphone {
	//필드(클래스 변수)
	String model;
	String color;
	//메소드(클래스 함수)
	
	void powerOn() {
		System.out.println("전원켜기");
	};//->전원켜기
	void powerOff() {
		System.out.println("전원끄기");
	};//->전원끄기
	void bell(){
		System.out.println("스피커를 통해서 알람, 벨소리");
	}; //->스피커를 통해서 알람, 벨소리
	void sendVoice(String msg){
		System.out.println("음성통화 자기: " + msg);
	};//-> 마이크 입력받고
	void receiveVoice(String msg){
		System.out.println("음성통화 상대방: " + msg);
	};// ->스피커 소리출력
	void hangUp() {
		System.out.println("전화를 끊기");
	};//->전화를 끊기, 전화받기
	
	
}
