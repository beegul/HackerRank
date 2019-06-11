package thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

public class DayEight {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
                
        int entries = scanner.nextInt();    

        for(int i = 0; i < entries; i++) {
            
            String name = scanner.next();
            int number = scanner.nextInt();

            phonebook.put(name, number);
        }
        
        while(scanner.hasNext()) {
            String query = scanner.next();
            
            if(phonebook.containsKey(query)) {
                System.out.println(query + "="+ phonebook.get(query));    
                
            }else {
                System.out.println("Not found");
            }            
        }        
        scanner.close();    
    }
}
