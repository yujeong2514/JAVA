package bit.r45.members;

//클래스
public class Student {
	
	//맴버들: 필드(속성), 매서드 (함수)
	
	/* 필드 */
	int age; //값을 대입하지않으면 0
	int color; // 1:red, 2: blue, 3: black
	
	
	/* 매서드 (필드의 값이 바뀌는 행위)*/
	
	/* run() */
	public void run() {
		int x = 1;
		int y;
		y = 2;
		
		int result = x + y;
		
		System.out.println("1+2=" + result);
		System.out.println("Student AGE: " + this.age);
	}
	
	// this
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
