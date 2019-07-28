package JavaBasic;

public class Tire {
	//속성(필드)
	public int maxRotation; // 최대회전수(최대수명, 최대주행거리)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {//타이어 사용가능 리턴
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location +" 타이어의 수명:" + 
					(maxRotation-accumulatedRotation) + "회" );
			return true;
		}else {
			System.out.println(location +" 타이어의 수명:" + 0);
			return false;
		}
	}
}
