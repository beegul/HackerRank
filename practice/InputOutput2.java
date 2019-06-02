package practice;

import java.util.Scanner;

public class InputOutput2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        double d = scanner.nextDouble(); 
        
        scanner.nextLine();
        
        String s = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}
