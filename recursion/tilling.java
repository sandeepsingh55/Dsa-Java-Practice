package recursion;

public class tilling {
    public static int tillingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm = tillingproblem(n - 1);
        int fnm2 = tillingproblem(n - 2);
        int total_ways = fnm + fnm2;
        return total_ways;

    }

    public static void main(String[] args) {
        System.out.println(tillingproblem(3));
    }
}
