package thirtydaysofcode;

import java.util.Scanner;

public class DayZero {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();	
		scanner.close();
		
		System.out.println("Hello, World.");
		System.out.println(input);
	}

}
