package bit;

public class bit {
    public static int getithbit(int n, int i) {
        int bitmsk = 1 << i;
        if ((n & bitmsk) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearbit(int n, int i) {
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    public static int clear_lastbit(int n, int i) {
        int bitmask = ((~0) << i);
        return n & bitmask;
    }

    public static int rangeclearbit(int n, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        int bitmask = a & b;
        return bitmask | n;
    }

    public static void evenOdd(int n) {
        int bitmask = 1;
        if ((bitmask & n) == 0) {
            System.out.println("number is even ");
        } else {
            System.out.println("number is odd");
        }
    }

    public static boolean twopow(int n) {
        // if ((n & (n - 1)) == 0) {
        // return true;
        // }
        return (n & (n - 1)) == 0;
    }

    public static int countset(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getithbit(10, 2));
        System.out.println(setIthbit(10, 2));
        System.out.println(clearbit(10, 2));
        System.out.println(clear_lastbit(10, 2));
        System.out.println(rangeclearbit(10, 2, 3));
        evenOdd(15);
        System.out.println(twopow(15));
        System.out.println(countset(10));

    }
}
