package fibonacci; // Consider renaming this package if it is strictly for palindrome.

import java.util.Scanner;

public class palindrome { 
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check for palindrome: ");
        int n = scanner.nextInt(); // Reading user input
        int r, sum = 0, temp;    
        
        temp = n;    
        while (n > 0) {    
            r = n % 10;  // Getting remainder  
            sum = (sum * 10) + r;    
            n = n / 10;    
        }    
        
        if (temp == sum)    
            System.out.println(temp + " is a palindrome number.");    
        else    
            System.out.println(temp + " is not a palindrome number.");    

        scanner.close(); // Closing the scanner
    }
}


