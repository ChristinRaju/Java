package fibonacci;

import java.util.Scanner;

public class multiplication {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Mutilpication table of num: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        
        scanner.close();
    }
}







