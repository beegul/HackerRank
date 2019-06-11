package thirtydaysofcode;

import java.util.ArrayList;
import java.util.Scanner;

public class DayTen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        int input = scanner.nextInt();                      
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");            
        scanner.close();
               
        ArrayList<Integer> binary = new ArrayList<Integer>();
               
        while(input > 0) {       	
        	int remainder = input % 2;
        	input = input / 2;
        	binary.add(0, remainder);
        }
                      
    	int longestChain = 0; 
    	int currentChain = 0;
    	
        for(int i : binary) { 
            System.out.print(i);  
        	if(i == 1) {
        		currentChain++;        		
        	}else{        		
        		if(currentChain > longestChain) {
        			longestChain = currentChain;
        		}        		        		
        		currentChain = 0;
        	} 
        	if(currentChain > longestChain) {
    			longestChain = currentChain;
    		} 
        }        
        System.out.println("\n"+longestChain);              
    }
}
