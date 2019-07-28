package JavaBasic;

public class ComputerCalc extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println(" ComputerCalc 원면적 계산 ");
		double calc = Math.PI * r * r;
		return calc; 
	}
}
