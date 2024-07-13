import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean x = isPrime(n);
        sc.close();
        System.out.println(x);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 0; i * i <= n; i++) {
                if (n % 2 == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}