import java.util.Scanner;

public class Eucliden {

    public static void main(String[] args) {
        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        int x = GCD(a, b);
        System.out.println(x);
    }

    public static int GCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        return a;
    }

}