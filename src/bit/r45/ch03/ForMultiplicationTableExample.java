package bit.r45.ch03;

import java.util.Scanner;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		int i = 1;
		
		System.out.println("단을 입력해주세요");
		System.out.println("단 : ");
		
		dan = scanner.nextInt();
//int num = scanner.nextInt();
		
		for(; i <=9; i++) {
			//구구단 출력 코드
			System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		scanner.close();
		
		}
	}

