
import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        float rad = sc.nextFloat();
        double area = 3.14 * rad * rad;

        System.out.println("multiplication of number is " + (mul));
        System.out.println(area);

    }
}