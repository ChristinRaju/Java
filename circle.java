package fibonacci;

import java.util.Scanner;

public class circle {
    double radius;
    double Pi = 3.14;

    public circle(double r) {
        radius = r;
    }

    public double area() {
        return Pi * radius * radius;
    }

    public double Circumference() {
        return 2 * Pi * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radiusInput = scanner.nextDouble();

        circle C1 = new circle(radiusInput);

        System.out.println("Area of the circle: " + C1.area());
        System.out.println("Circumference of the circle: " + C1.Circumference());

        scanner.close();
    }
}
