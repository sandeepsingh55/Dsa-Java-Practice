package GreedyAlgorithm;

import java.util.*;

public class Maxchain {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparing(o -> o[1]));
        int chainlen = 1;
        int chain_end = pairs[0][1]; // Last select pair end
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chain_end) {
                chainlen++;
                chain_end = pairs[i][1];
            }
        }

        System.out.println("maximum chain lenght " + chainlen);

    }

}
