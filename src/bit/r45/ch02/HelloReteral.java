package bit.r45.ch02;

public class HelloReteral {
	//맴버 필드
	char ch = 'a';
	int v4 = 0;
	
	
	//맴버 메소드
	public static void main(String[] args) {

		char a = 'a';
		char b = 'b', c = 'c';   //문자형
		
		String str = "안녕하세요";
		System.out.print(str);	
		
		printstr();
		
	}
	
	
	static void printstr() {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1:" + var1 + "\t" + "var2: " + var2);
		}
		
	}
	
	
	void run() {
//		System.out.print(a);
//		System.out.print(str);
		System.out.print(ch);
		
		int v1 = 10, v2 = 0;
		if(v1 > 10) {
			v2 = v1 - 5;
		}//선언을 어느 위치에 했느냐에 따라서 탐색이 다르다 (선언되어있는 위치의 블럭)
		int v3 = v1 + v2 +10;//
		//v4계산
		v4 = v3 + 10;
		
	}
	
	void mtprint() {
		System.out.println(v4);
	}
	//맴버 필드가 밑에와도 상관없다 BUT 계산식이 오는건 안됨(int abc=로 입력)
	
}
