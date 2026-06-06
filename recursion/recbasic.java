package recursion;

public class recbasic {
    public static void printn(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }
        System.out.println(n + " ");
        printn(n - 1);
    }

    public static void main(String[] args) {
        printn(10);

    }

}
