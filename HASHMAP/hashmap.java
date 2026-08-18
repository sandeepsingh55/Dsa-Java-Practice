package HASHMAP;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 200);
        hm.put("china", 288);
        hm.put("indonesia", 588);
        hm.put("malsiya", 569);
        hm.put("vitenam", 890);

        System.out.println(hm);
        System.out.println(hm.containsKey("china"));
        System.out.println(hm.get("india"));
        System.out.println(hm.remove("china"));
        System.out.println(hm.isEmpty());

        // hm.clear();
        // System.out.println(hm);

        Set<String> key = hm.keySet();
        for (String s : key) {
            System.out.println("keys " + s + " value " + hm.get(s));

        }

    }
}
