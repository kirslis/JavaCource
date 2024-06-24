import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Application {
    public static long factorial(int x) {
        long res = x;

        if (x > 1) {
            res *= factorial(x - 1);
        }

        return res;
    }

    public static double getS(int x, int n) {
        double res = Math.pow(-1, n) * (2 * n * Math.pow(x, 2 * n + 1)) / (double) factorial(2 * n + 1);
        if (n > 1)
            res += getS(x, n - 1);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n;
        System.out.print("Input N:");
        n = sc.nextInt();
        System.out.print("input X:");
        x = sc.nextInt();

        System.out.println(getS(x, n));
    }
}