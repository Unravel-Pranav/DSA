import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        int x = LCM(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + x);
    }

    public static int LCM(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }
}
