import java.util.Scanner;

class OptimizedTrailZero {
    public static void main(String args[]) {
        int ans = 0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans = TrailZero(n);
        System.out.println(ans);
    }

    public static int TrailZero(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

}