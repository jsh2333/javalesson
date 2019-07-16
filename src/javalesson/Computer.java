package javalesson;

public interface Computer {
	static final String COMPUTER_OS_TYPE="WINDOWS10";
	
	abstract void work();
	abstract void purpose();
}

 
class Notebook implements Computer {

	float weight;

	Notebook() {
	}

	Notebook(float w) {
		this.weight = w;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void work() {
		System.out.println("비즈니스 노트북");
	}

	@Override
	public void purpose() { // TODO Auto-generated method stub
		System.out.println("이동시 거래처 기록용");
	}

	@Override
	public String toString() {
		return "Notebook [weight=" + weight + "]";
	}

}

class Desktop implements Computer {

	@Override
	public void work() {
		System.out.println("고사양 작업실 컴퓨터");

	}

	@Override
	public void purpose() {
		System.out.println("그래픽 작업용");

	}

}
 
