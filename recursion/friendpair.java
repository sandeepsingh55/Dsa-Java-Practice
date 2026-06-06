package recursion;

public class friendpair {
    public static int friendpairing(int n) {
        if (n == 2 || n == 1) {
            return n;
        }
        return friendpairing(n - 1) + (n - 1) * friendpairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendpairing(3));

    }

}
