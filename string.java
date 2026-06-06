
import java.util.Scanner;

public class string {
    public static boolean palimdrome(String name) {
        int n = name.length();
        for (int i = 0; i < (name.length()) / 2; i++) {
            if (name.charAt(i) != name.charAt(n - i - 1)) {
                // not palimdrome
                System.out.println("not palimdrome ");
                return false;
            }
        }
        return true;
    }

    // find substring
    public static void substring(String str, int st, int en) {
        String sub = "";
        for (int i = st; i < en; i++) {
            sub += str.charAt(i);
        }
        System.out.println(sub);
    }

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name.charAt(3));
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        palimdrome(name);
        substring(name, 0, 4);

        String fruits[] = { "apple", "mango", "bannana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        // reverse string
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);

        }
        System.out.println("reverse string :" + rev);

    }

}
