package bit.r45.ch03;

public class CharOperationExample {

	public static void main(String[] args) {
//		char c1 = 'A';
//		char c2 = c1 + 1;
//		char c2 = 'A' + 1;
//		
//		System.out.println("A: " + c1 + " B: " + c2);
//		
//		//조건문에는 'A'대신에 c1 연산자사용이 가능하다 (연산자는 정수 연산이므로 int결과 but int조건 비교는 가능)
//		if( (c1 + 1) == 66) {
//			System.out.println("c1 is B");
		
//		System.out.println( -8 >> 3);
//		
//		if( (-8 >> 3) == -1) {
//			System.out.println("-8 >> 3 = " + (-8>>3));
//		}
//		System.out.println("-8 >>> 3 = " + (-8>>>3));
		
		int a = 100; //입력
		int b = 0; //출력
		
		
		//조건식
		if( a > 100) {
			b = -1;
		} else {
			b = 1;
		}
		
	
		System.out.println("출력: " + b);
		
		//삼항 연산자
		System.out.println("출력: " + ( a > 100 ? -1 : 1) );
		
		//같은 의미 System.out.println("출력: " + ( a > 100 ? "-1" : "1") );//변수에 대입하거나 출력할떄 
		// 이렇게도 사용 가능 b = ( a > 100 ? -1 : 1);
	}

}
