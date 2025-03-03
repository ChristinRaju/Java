package study;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        double sum = 0;

        // Input numbers and calculate sum
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextDouble();
        }

        // Calculate and display average
        double average = sum / n;
        System.out.println("Average: " + average);

        sc.close();
    }
}

//QUESTION 6