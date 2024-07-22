import java.util.*;

public class ShortSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        sieveOfEratosthenes(n);

    }

    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Set all values to true initially

        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                System.out.print(p + " ");
                // Update all multiples of p to not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

    }
}
