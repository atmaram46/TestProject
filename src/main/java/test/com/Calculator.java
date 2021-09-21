package test.com;

public class Calculator {
	
	CalculatorService calC;
	
	public Calculator(CalculatorService service) {
		this.calC = service;
	}
	
	public int perform(int x, int y) {
		return x*(calC.add(x, y));
	}

}
