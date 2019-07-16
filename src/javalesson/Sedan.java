package javalesson;

public class Sedan extends Car {

	int seatNum;

	final static String CAR_TYPE="승용차";
	
	Sedan(){
		System.out.println("Sedan() 생성");
	}
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

}
