package StackL;

import java.util.Stack;

public class revstack {
    public static void pushatbootom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbootom(s, data);
        s.push(top);
    }

    public static void reverser(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverser(s);
        pushatbootom(s, top);
    }

    public static void printstack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop(); 

        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverser(s);
        printstack(s);

    }

}
