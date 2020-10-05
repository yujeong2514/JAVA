package bit.r45.ch03;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("과목을 선택하세요.");
//		System.out.println("(1.자바   2.C   3.C++   4.파이썬)");
//		System.out.println("과목번호: ");
//		
//		int inputInt = scanner.nextInt();
//		
//		switch (inputInt) {
//		case 1:
//			System.out.println("R101호 입니다.");
//			break;
//		case 2:
//			System.out.println("R202호 입니다.");
//			break;
//		case 3:
//			System.out.println("R303호 입니다.");
//			break;
//		case 4:
//			System.out.println("R404호 입니다.");
//			break;
//		default:
//			System.out.println("상담원에게 문의하세요");
//			break;
//		}

//		int time = (int)(Math.random()*4) + 8; 
//		System.out.println("[현재시간: " + time + "시]");
//		
//		switch(time) {
//		  case 8:
//			System.out.println("출근합니다.");
//		  case 9:
//			System.out.println("회의를 합니다.");
//		  case 10:
//			System.out.println("업무를 봅니다.");
//		  default:
//			System.out.println("외근을 나갑니다.");
//		}
		
//		//8 < .. < 12사이의 정수 얻기
//		int n1 = (int)(Math.random() * 10;
//		int n2 = (int)(Math.random()*4) + 8; 
//	
//		System.out.println(n1);
//		System.out.println(n2);
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("월을 입력하세요");
//		
//		int inputInt = scanner.nextInt();
//		
//		switch (inputInt) {
//		case 1:
//			System.out.println("31일 입니다.");
//			break;
//		case 2:
//			System.out.println("28일 입니다.");
//			break;
//		case 3:
//			System.out.println("31일 입니다.");
//			break;
//		case 4:
//			System.out.println("30일 입니다.");
//			break;
//		case 5:
//			System.out.println("31일 입니다.");
//			break;
//		case 6:
//			System.out.println("30일 입니다.");
//			break;
//		case 7:
//			System.out.println("31일 입니다.");
//			break;
//		case 8:
//			System.out.println("31일 입니다.");
//			break;
//		case 9:
//			System.out.println("30일 입니다.");
//			break;
//		case 10:
//			System.out.println("31일 입니다.");
//			break;
//		case 11:
//			System.out.println("30일 입니다.");
//			break;
//		default:
//			System.out.println("31일 입니다.");
//			break;
//			
//			//또는 같은 일수의 case별로 묶은뒤 break해주는 방식으로도 가능 
		
		
//		//문자열
//		String s = "";
//		switch(s) {
//		case "":
//			break;
		
//		char grade = 'B';
//		
//		switch(grade) {
//		case 'A':
//		case 'a':
//			System.out.println("우수 회원입니다.");
//			break;
//		case 'B':
//		case 'b':
//			System.out.println("일반 회원입니다.");
//			break;
//		default:
//			System.out.println("손님 입니다.");
		
		//switch 연습문제
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		
		int year = scanner.nextInt();
		boolean leaf = isLeafyear(year);
		
		if(leaf) {
		//if(isLeafyear(year)) {	
			System.out.println( year + "년은 윤년");
		} else {
			System.out.println( year + "년은 평년");
		} 
		
	}
	
	private static boolean isLeafyear(int year) {
		if( (year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		
		}
		
	}

}

