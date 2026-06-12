package QUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class Q7 {
    public static class Queue {
        Deque<Integer> d = new LinkedList<>();

        public void add(int data) {
            d.addFirst(data);
        }

        public int remove() {
            return d.removeFirst();
        }

        public int peek() {
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("peek " + q.peek());
        System.out.println("remove " + q.remove());
        System.out.println("peek " + q.peek());
        System.out.println("remove " + q.remove());
        System.out.println("peek " + q.peek());
        System.out.println("remove " + q.remove());
        System.out.println("peek " + q.peek());
        System.out.println("remove " + q.remove());

    }

}
