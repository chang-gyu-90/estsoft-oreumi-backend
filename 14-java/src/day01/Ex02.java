package day01;

public class Ex02 {
    static void main() {
        int x = 10;
        int y = 3;

        double result = (double) x/ y;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println(" x + y = " + (x + y));
        System.out.println(" x - y = " + (x - y));
        System.out.println(" x * y = " + (x * y));
        System.out.printf("x / y = %.2f\n", result);
        System.out.println(" x % y = " + (x % y));
    }
}
