package bit.r45.first;

import java.io.IOException;

import bit.r45.members.*;


public class Hello 
{		
	public static void main(String[] args) 
	{
		
		/*
		 * // // Student student; // // student = new Student(); // // try { // // }
		 * catch (Exception e) { // // TODO: handle exception // } // System.in.read();
		 * // }
		 * 
		 * // System.out.println("Hello~~~"); // // System.err.print("error!");
		 */		
		
		Student student;
		
		//new를 사용하여 Student의 내용을 불러와야한다(이하내용은 매서드)
		student = new Student();
		student.run();
		student.setAge(100);
		student.run();
		
	}

}
