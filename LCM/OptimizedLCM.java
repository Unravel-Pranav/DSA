import java.util.Scanner;

public class OptimizedLCM {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        int x = LCM(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + x);
        sc.close(); // Close the scanner to avoid resource leaks
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public static int LCM(int a, int b) {
        return Math.abs(a * b) / GCD(a, b);
    }
}
