package SoftUniExecersise;

import java.util.Scanner;

public class C2 {
	
	/***
	 * Task
	 * 
	 * You will be given 3input lines
	 *  - Student Name 
	 *  - Age 
	 *  - Average grade
	 *  
	 *  Print the input in the following format 
	 *   - "Name : {name}, Age: {age}, Grade: {grade}"
	 *   - Format the grade up to 2 decimal places
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Provide Name");
		String name = s.nextLine();
		
		
		System.out.println("Provide Age");
		int age = s.nextInt();
//		int age1 = Integer.parseInt(s.nextLine()); // 2nd way
		
		System.out.println("Provide Grade");
		double grade = s.nextDouble();
//		double grade1 = Double.parseDouble(s.nextLine()); //2nd way
		
		
		System.out.println(		String.format("Name : %s, Age: %d, Grade: %.2f", name,age,grade));
		
	
	}

}
