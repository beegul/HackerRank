package practice;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
					
		firstNumber = scanner.nextInt();			
		secondNumber = scanner.nextInt();			
		thirdNumber = scanner.nextInt();
		
		scanner.close();
			
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);	
	}
}