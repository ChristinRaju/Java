package fibonacci;

import java.util.Scanner;

public class armstrog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number, remainder, result = 0;
        int d=0;
        
        while (originalNumber != 0) {
            remainder = originalNumber % 10;            
            originalNumber /= 10;
            d++;
        }
        
        originalNumber = number;

        // Calculate the Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, d);
            originalNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        scanner.close();
    }
}
