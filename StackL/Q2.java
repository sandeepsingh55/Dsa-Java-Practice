package StackL;

import java.util.*;

public class Q2 {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char se = s.pop();
            result.append(se);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abv";
        System.out.println(reverse(str));

    }
}
