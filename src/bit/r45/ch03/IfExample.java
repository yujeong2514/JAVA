package bit.r45.ch03;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오: ");
		int inputInt = scanner.nextInt();
		
		if(inputInt > 0) {
			System.out.println("양수");
		} else if(inputInt == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}

	}

}
