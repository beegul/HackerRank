package thirtydaysofcode;

import java.util.Scanner;

public class DaySix {
	
	public static String SortString(String input) {
		
		char[] convertedString = input.toCharArray();
		
		String oddLetters = "";
		String evenLetters = "";
		
		for(int i = 0; i < convertedString.length; i++) {
			if(i % 2 == 0) {
				oddLetters += convertedString[i];
			}else {
				evenLetters += convertedString[i];
			}			
		}		
		return oddLetters + " " + evenLetters;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int inputCount = scanner.nextInt();
		
		scanner.nextLine();
		
		for(int i = 0; i < inputCount; i ++) {
			
			String input = scanner.nextLine();
			
			System.out.println(SortString(input));			
		}
		
		scanner.close();
	}
}
