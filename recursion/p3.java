package recursion;

public class p3 {
    public static int sumTOn(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + sumTOn(n - 1);
    }

    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static int firstoccur(int arr[], int key, int i) {

        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, key, i + 1);
    }

    public static int lastoccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int found_at = lastoccur(arr, key, i + 1);
        if (found_at == -1 && arr[i] == key) {
            return i;
        }
        return found_at;
    }

    public static void main(String[] args) {
        int result = sumTOn(10);
        System.out.println(result);
        int arr[] = { 1, 2, 3, 4, 5, 9, 6, 5 };
        System.out.println(issorted(arr, 0));
        System.out.println(firstoccur(arr, 9, 0));
        System.out.println(lastoccur(arr, 5, 0));

    }
}
