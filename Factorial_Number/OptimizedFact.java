import java.util.Scanner;

class OptimizedFact {
    public static void main(String args[]) {

        int f = 0;

        System.out.println("Enter the nuber");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        f = fact(n);

        System.out.println(f);

    }

    // Used Recursion
    public static int fact(int n) {
        if (n == 0) {
            return 1;

        } else {
            return n * fact(n - 1);
        }
    }
}