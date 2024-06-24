import java.util.Scanner;

public class Application {
    public static double getResOfFirstEquation(int x, int a, int b) {
        double res;
        if (x <= 3) {
            res = b + 2 * Math.log(Math.abs(x));
        } else {
            res = Math.pow(x, 2) / ((double) Math.pow(x, 2) + a);
        }

        return res;
    }

    public static double getResOfSecondEquation(int x, int a, int b) {
        double res;
        if (x <= 0) {
            res = Math.cos(b * x + 1);
        } else {
            res = a + 1. / 2 * Math.exp(-x);;
        }

        return res;
    }

    public static double getResOfThirdEquation(int x, int a, int b) {
        double res;
        if (x <= 1) {
            res = 1. / (Math.pow(x, 2) + Math.pow(a, 2));
        } else {
            res = b * Math.log(x);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfEquation;
        System.out.println("Enter the number of sequence: ");
        numberOfEquation = sc.nextInt();

        int x, a, b;
        System.out.println("Input x:");
        x = sc.nextInt();
        System.out.println("Input a:");
        a = sc.nextInt();
        System.out.println("Input b:");
        b = sc.nextInt();

        double res = 0;
        switch (numberOfEquation) {
            case 1:
                res = getResOfFirstEquation(x, a, b);
                break;
            case 2:
                res = getResOfSecondEquation(x, a, b);
                break;
            case 3:
                res = getResOfThirdEquation(x, a, b);
                break;
            default:
                System.out.println("No such equation");
        }
        System.out.println(res);
    }
}