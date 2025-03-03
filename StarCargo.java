package study;

import java.util.Scanner;

public class StarCargo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cargo weight on Earth (in kg): ");
        double earthWeight = scanner.nextDouble();

        System.out.println("Select a destination planet (1-7):");
        System.out.println("1. Mercury\n2. Venus\n3. Mars\n4. Jupiter\n5. Saturn\n6. Uranus\n7. Neptune");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double[] gravityFactors = {0.38, 0.91, 0.38, 2.34, 1.06, 0.92, 1.19};
        String[] planetNames = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        if (choice >= 1 && choice <= 7) {
            double relativeGravity = gravityFactors[choice - 1];
            double planetWeight = earthWeight * relativeGravity;

            System.out.printf("The cargo weight on %s will be: %.1f kg\n", planetNames[choice - 1], planetWeight);
        } else {
 
            System.out.println("Invalid choice. Please select a number between 1 and 7.");
        }

        scanner.close();
    }
}


