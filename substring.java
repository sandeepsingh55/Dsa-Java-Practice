
import java.util.Arrays;

public class substring {
    public static void anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // for(int i=0;i<arr1.length;i++){
        // if(arr1[i]!=arr2[i]){
        // return false;
        // }
        // }
        // return true;
        // return Arrays.equals(arr1,arr2);
        String s3 = String.valueOf(arr1);
        String s4 = String.valueOf(arr2);
        if (s3.equals(s4)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

    }

    public static void main(String[] args) {
        int sum = 0;
        String s = "6759";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                sum += Integer.parseInt(sub);
            }
            System.out.println(sum + " ");
        }

        StringBuilder sb = new StringBuilder("Sandeep");
        String rev = "";

        for (int i = sb.length() - 1; i >= 0; i--) {
            rev += sb.charAt(i);

        }
        System.out.println(rev);

        String s1 = "race";
        String s2 = "cary";
        anagram(s1, s2);
    }

}
