package bit.r45.ch04;

public class ClassPractice {

	public static void main(String[] args) {

		Car car = new Car();  //new car --> 생성자 호출 (메서드)
	
		System.out.println(car.info());
		System.out.println(car.info("Hello~"));  //method overloading msg
		
		Car car2 = new Car("로또당첨!!");

	
		System.out.println(car);
		System.out.println(car2);
		
	}

}
