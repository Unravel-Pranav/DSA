import java.util.Scanner;

/**
 * PrimeFactors
 */
public class PrimeFactors {

    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        CalcFactors(n);
    }

    public static void CalcFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) { // Check if prime
                int x = i; // x for checking powers
                while (n % x == 0) {
                    System.out.print(i + "\n");
                    x = x * i; // Check if its power also divides n and print it Ex: 2 Divides then check for
                               // 4.

                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}