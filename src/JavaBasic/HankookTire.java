package JavaBasic;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	public boolean roll() {//타이어 사용가능 리턴
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location +" HankookTire 타이어의 수명:" + 
					(maxRotation-accumulatedRotation) + "회" );
			return true;
		}else {
			System.out.println(location +" 타이어의 수명:" + 0);
			return false;
		}
	}
	
	
	
}
