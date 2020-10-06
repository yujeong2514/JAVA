package bit.r45.ch04;

public class CalculatorExample {

	public static void main(String[] args) {
		//생성자
		Calculator c1 = new Calculator();
		System.out.println(c1.pi);
		
		//스테틱
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(1,2));
	}

}
