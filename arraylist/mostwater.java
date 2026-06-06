package arraylist;

import java.util.ArrayList;

public class mostwater {
    public static int most_water(ArrayList<Integer> height) {
        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int length = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int water = length * width;
                maxwater = Math.max(maxwater, water);
            }
        }
        return maxwater;
    }

    // two pointer approch
    // TC 0(n)
    public static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int curwater = ht * width;
            maxwater = Math.max(curwater, maxwater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(most_water(height));
        System.out.println(storewater(height));

    }

}
