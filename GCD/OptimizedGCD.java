import java.util.Scanner;

public class OptimizedGCD {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        int x = GCD(a, b);
        System.out.println(x);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
