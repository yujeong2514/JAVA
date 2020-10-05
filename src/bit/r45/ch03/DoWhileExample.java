package bit.r45.ch03;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// 최소 한번은 실행된다 -->do
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하여면 q를 입력하세요.");
		
		Scanner sn = new Scanner (System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sn.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
