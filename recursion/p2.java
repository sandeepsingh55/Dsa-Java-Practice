package recursion;

public class p2 {
    public static void printn(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        printn(n - 1);
        System.out.println(n + " ");

    }

    public static void main(String[] args) {
        printn(10);

    }
}
