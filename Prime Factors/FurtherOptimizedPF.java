import java.util.Scanner;

class EfficientPrimeFactor {
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
            return;
        }
        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n = n / 3;

        }

        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }

            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n = n / (i + 2);
            }
        }

        if (n > 3) {
            System.out.println(n);
        }

        System.out.println("Done");
    }
}
