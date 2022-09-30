package SoftUniExecersise;

import java.util.Scanner;

public class C1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int number = Integer.parseInt(s.nextLine());
		
		System.out.println("You just enetered  : %d%n" + number);
		
		String name = "George";
		int age = 5;
		String res = String.format("Name: %s, Age: %d", name,age);  // the %s is taking the String value, the %d is taking the Int value 
		System.out.println(res);
	}

}
