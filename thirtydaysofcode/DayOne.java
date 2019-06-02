package thirtydaysofcode;

import java.util.Scanner;

public class DayOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int baseInt = 4;
		double baseDouble =4.0;
		String baseString = "HackerRank ";
				
		int secondInt = scanner.nextInt();
		double secondDouble = scanner.nextDouble();
		
		scanner.nextLine();
		
		String secondString = scanner.nextLine();
	
		scanner.close();
		
		System.out.println(baseInt + secondInt);
		System.out.println(baseDouble + secondDouble);
		System.out.println(baseString + secondString);				
	}
}
