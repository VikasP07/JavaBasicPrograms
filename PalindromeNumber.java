package JavaBasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int remender;

        while (n > 0) {
            remender = n % 10;
            sum = (sum * 10) + remender;
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is non palindrome");
        }
    }
}
