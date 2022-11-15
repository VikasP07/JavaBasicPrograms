package JavaBasicPrograms;

import java.util.Scanner;

public class RamdomNumber {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The random number is: " + Math.random());

        System.out.print("Enter range from: ");
        int a = sc.nextInt();

        System.out.print("Enter number to: ");
        int b = sc.nextInt();

        int num = (int) (Math.random() * (b - a + 1) + a);
        System.out.print("The random number between " + a + " and " + b + " is : ");
        System.out.print(num);
    }
}
