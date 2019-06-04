package thirtydaysofcode;

import java.util.Scanner;

public class DayFour {

    private int age;	
    
	public DayFour(int initialAge) {		
		if(initialAge > 0) {
	  		age = initialAge;
		}
		else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}		
	}

	public void amIOld() {		
		if(age < 13) {
			System.out.println("You are young.");
		}else if(age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		}else if(age >= 18){
			System.out.println("You are old.");
		}	
	}

	public void yearPasses() {
  		age += 1;
	}
				
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0; i < T; i++) {
			
			int age = scanner.nextInt();
			
			DayFour person = new DayFour(age);
			
			person.amIOld();
			
			for (int j = 0; j < 3; j++) {
				person.yearPasses();
			}
			
			person.amIOld();
			
			System.out.println();
        }
		scanner.close();
	}

}
