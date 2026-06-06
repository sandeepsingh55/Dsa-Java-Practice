package StackL;

import java.util.ArrayList;

public class MyStack {
    static class StackB {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        StackB st = new StackB();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();

        }

    }

}
