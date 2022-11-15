package JavaBasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number to check armstrong or not: ");

        int n = sc.nextInt();
        
        int originalNumber = n;
        int result = 0;
        int remender;

        while (n != 0) {
            remender = n % 10;
            result += Math.pow(remender, 3);
            n /= 10;
        }

        if (result == originalNumber) {
            System.out.println("The number is armstrong number");
        } else {
            System.out.println("The number is not armstrong number");
        }
    }
}
