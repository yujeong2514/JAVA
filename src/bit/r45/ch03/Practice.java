package bit.r45.ch03;

public class Practice {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//참조형 변수중 하나
//		int[] intArray = null;
//		intArray[0] = 10;    //NullPointException
//
//		System.out.println(intArray);

		//배열 초기화
		int[] scores = {100, 99, 80, 90, 50};
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		System.out.println("Arg: " + sum/5);
		
		
		//length를 통해 배열의 크기를 쉽게 알아낼수 있다
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("Arg: " + sum/scores.length);
		
		
		
		//문자열 배열
		String[] messages = {
				"안녕하세용",
				"뇽",
				"꾸~~~",
				"하이~~~"
		};
		
		for(int i = 0; i < messages.length; i++) {
			System.out.println(messages[i]);
		}
		
		//배열 초기: new
		int[] adder = new int [5];
		for(int i = 0; i < scores.length; i++) {
			adder[i] = scores[i] + 2;
		}
		//참조형 주소:
		System.out.println(scores );
		System.out.println(messages);
		System.out.println(adder);
		
		
	}

}
