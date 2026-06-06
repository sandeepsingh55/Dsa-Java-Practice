package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(8);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(1);
        list.set(2, 99);
        System.out.println(list);
        System.out.println(list.contains(33));
        System.out.println(list.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("maximum element " + max);

    }

}
