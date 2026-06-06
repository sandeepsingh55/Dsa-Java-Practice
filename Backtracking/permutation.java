package Backtracking;

public class permutation {
    public static void findpermutation(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // abcde me c skip "ab"+"de"
            String newstr = s.substring(0, i) + s.substring(i + 1);
            findpermutation(newstr, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        findpermutation(s, "");

    }
}
