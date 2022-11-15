package JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("The number is prime number");
        } else {
            System.out.println("The number is non prime number");
        }
    }
}
