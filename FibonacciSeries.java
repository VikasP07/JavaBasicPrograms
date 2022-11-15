package JavaBasicPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 9;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
