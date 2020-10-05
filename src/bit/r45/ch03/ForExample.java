package bit.r45.ch03;

public class ForExample {

	public static void main(String[] args) {
		
		//1~6까지 더하기
		int sum = 0;
		for(int i = 0; i < 7; i++) {
			
			sum = i + sum;
		}
		
		System.out.println(sum);
		
		//1~100까지 더하기
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			sum = i + sum;
		}
		
		System.out.println(sum);
		
		//for: sum을 1~20까지 2씩 더하기
		sum = 0;
		for(int i = 1; i <= 20; i++) {
		
			sum = i + sum;
		}
		
		System.out.println(sum);
		
		//forL sum 1~100까지 더히기 BUT sum이 85인 결우 빠져나오기
		sum = 0;
		for(int i = 1; i <= 100; i++) {
		
			if (sum == 85)	
				break;    //한줄만 사용할 경우 줄여서 사용 가능하다{}생략
			
			System.out.println(sum);
			sum = i + sum;
		}	
			System.out.println("sum: " + sum);


		//
		sum = 0;
		int k = 0;
		for(k = 1; k <= 100; k++) {
			sum = k + sum;
	}
		System.out.println("횟수: " + k + "번 만에 sum = " + sum);
		
		
}
	
}