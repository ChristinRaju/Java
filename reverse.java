package fibonacci;

import java.util.Scanner;

public class reverse   {  
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  
        int reverse = 0;  

        while(number != 0){       
            int remainder = number % 10;  // Get the last digit
            reverse = reverse * 10 + remainder;  // Add it to the reversed number
            number = number / 10;  // Remove the last digit from the number
        }

        System.out.println("The reverse of the given number is: " + reverse);

        scanner.close();
    }  
}
