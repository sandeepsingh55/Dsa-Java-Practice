package StackL;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextgtr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextgtr[i] = -1;
            } else {
                nextgtr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextgtr.length; i++) {
            System.out.print(nextgtr[i] + " ");
        }
        System.out.println();
    }

}
