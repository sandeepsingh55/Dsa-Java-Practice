package GreedyAlgorithm;

import java.util.*;

public class coins {
    public static void main(String[] args) {
        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 20000 };
        Arrays.sort(coin, Comparator.reverseOrder());

        int coincount = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coin.length; i++) {
            if (coin[i] < amount) {
                while (coin[i] <= amount) {
                    coincount++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }
        System.out.println("total notes include in amount " + coincount);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("no of notes include in amoumnt " + ans.get(i) + " ");
        }

    }

}
