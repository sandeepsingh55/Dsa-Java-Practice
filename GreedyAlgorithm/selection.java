package GreedyAlgorithm;

import java.util.ArrayList;

public class selection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // first activity selection
        maxActivity = 1;
        ans.add(0);
        int endtime = end[0];
        for (int i = 1; i < end.length; i++) {

            if (start[i] >= endtime) {
                maxActivity++;
                ans.add(i);
                endtime = end[i];
            }
        }
        System.out.println("Activity selection " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A " + ans.get(i) + " ");
        }
        System.out.println();

    }

}
