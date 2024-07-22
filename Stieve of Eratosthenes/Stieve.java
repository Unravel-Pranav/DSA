import java.util.*;

/**
 * Stieve
 */
public class Stieve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        boolean[] primes = sieveOfEratosthenes(n);

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Set all values to true initially
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        // Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Update all multiples of p to not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        return isPrime;
    }
}
