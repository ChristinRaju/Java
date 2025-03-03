package study;

import java.util.Scanner;

class Student{
	int regno;
	public Student(int reg) {
		regno = reg;
	}
	public void display() {
		System.out.print("Reg no: " + regno);
	}
}

public class studentApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Reg no: ");
		int st_reg = scanner.nextInt();
		Student s = new Student(st_reg);
		s.display();
		scanner.close();
		
	}

}
