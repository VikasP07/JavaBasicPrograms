package JavaBasicPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
