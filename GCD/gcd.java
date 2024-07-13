import java.util.Scanner;

class gcd {
    public static void main(String args[]) {
        System.out.println("Enter the 1st number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int x = GCD(a, b);
        System.out.println(x);
    }

    public static int GCD(int x, int y) {

        int res = Math.min(x, y);

        while (res > 0) {
            if (x % res == 0 && y % res == 0) {
                break;
            }
            res--;

        }
        return res;

    }
}