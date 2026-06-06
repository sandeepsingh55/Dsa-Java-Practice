public class strcompress {
    public static void main(String[] args) {
        String s = "aaaabbbcccddd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() || s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(s.charAt(i));
                result.append(count);
                count = 1;
            }
        }
        System.out.println(result.toString());

        // StringBuilder sb = new StringBuilder();
        // String s = "aaaabbbcccddd";

        // for (int i = 0; i < s.length(); i++) {
        // s.charAt(i);
        // Integer count = 1;
        // while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        // i++;
        // count++;
        // }
        // sb.append(s.charAt(i));
        // if (count > 1) {
        // sb.append(count);
        // }
        // }
        // System.out.println(sb.toString());
        // System.out.print("jhj");
    }
}
