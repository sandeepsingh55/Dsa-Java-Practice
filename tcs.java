
import java.util.Scanner;

public class tcs {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;

        }
        return gcd(b, a % b);
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int res = 0;
        int a = 48;
        int b = 36;
        while (n > 0) {
            int rem = n % 10;
            res += Math.pow(rem, 3);
            n /= 10;
        }
        if (number == res) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }
        System.out.println(gcd(a, b));

        System.out.println(fibo(10));
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + fibo(i));
        }

        int arr[] = { 10, 50, 60, 70, 80 };
        int max = Integer.MIN_VALUE;
        int se = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("maximum element of arr" + max);

        for (int i = 0; i < arr.length; i++) {
            if (se < arr[i] && arr[i] != max) {
                se = arr[i];
            }
        }
        System.out.println("second largest number" + se);

    }
}
