package study;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (r in %): ");
        double rate = scanner.nextDouble() / 100; // Convert percentage to decimal

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of years (t): ");
        int t = scanner.nextInt();

        double amount = principal * Math.pow((1 + rate / n), (n * t));

        System.out.printf("Final amount (A) after %d years: %.2f%n", t, amount);

        scanner.close();
    }
}

//QUESTION 5