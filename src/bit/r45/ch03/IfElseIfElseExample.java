package bit.r45.ch03;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바   2.C   3.C++   4.파이썬)");
		
		int inputInt = scanner.nextInt();
		
		if( inputInt == 1) {
			System.out.println("R101호 입니다.");
		} else if( inputInt == 2) {
			System.out.println("R202호 입니다.");
		} else if( inputInt == 3) {
			System.out.println("R303호 입니다.");
		} else if( inputInt == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요");
		}

	}

}
