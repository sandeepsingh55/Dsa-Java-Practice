package HEAPS;

import java.util.*;

public class PriorityQueque {
    public static class Student implements Comparable<Student> {
        String names;
        int rank;

        public Student(String names, int rank) {
            this.names = names;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s) {
            return this.rank - s.rank;
        }

    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // if we have to print reverse we will pass Comparator.reverse()
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 2));
        pq.add(new Student("D", 3));
        pq.add(new Student("k", 8));
        pq.add(new Student("M", 9));
        pq.add(new Student("P", 10));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().names + "-->" + pq.peek().rank);
            pq.remove();
        }
    }
}
