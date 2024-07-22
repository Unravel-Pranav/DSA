import java.util.Scanner;

/**
 * EfficentDivisors
 */
public class EfficentDivisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        FindDivisors(n);
    }

    public static void FindDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);

                }
            }
        }

    }
}