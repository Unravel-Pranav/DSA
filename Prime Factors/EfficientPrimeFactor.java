import java.util.Scanner;

public class EfficientPrimeFactor {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        PrintPrimeFac(n);
    }

    public static void PrintPrimeFac(int n) {
        if (n <= 1) {
            System.out.println("Done");
            return; // Return early if n is less than or equal to 1
        }

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }

        System.out.println("Done");
    }
}
