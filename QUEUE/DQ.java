package QUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class DQ {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(10);
        q.addLast(2);
        q.addFirst(3);
        q.addLast(30);
        q.removeFirst();
        q.removeFirst();
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
    }

}
