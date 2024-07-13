import java.util.Scanner;

class Count_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        int c = count(x);
        System.out.println("Number of digits in " + x + " is: " + c);
    }

    public static int count(int a) {
        int res = 0;
        while (a > 0) {
            a = a / 10;
            res++;
        }
        return res;
    }
}
