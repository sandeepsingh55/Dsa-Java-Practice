package recursion;

public class append {
    public static void printstring(int n, int lastpost, String s) {
        if (n == 0) {
            System.out.println(s);
            return;

        }
        if (lastpost == 0) {
            printstring(n - 1, 0, s += "0");
            printstring(n - 1, 1, s += "1");
        } else {
            printstring(n - 1, 0, s += "0");
        }
    }

    public static void main(String[] args) {
        printstring(3, 0, "");
    }
}
