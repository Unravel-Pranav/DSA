import java.util.Scanner;

class TrailZero {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countZeros(n);
        System.out.println(ans);
    }

    // Iterative approch
    public static int countZeros(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }

        return res;

    }

}