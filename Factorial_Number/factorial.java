import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        int res = 1;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        System.out.print(res);
    }
}