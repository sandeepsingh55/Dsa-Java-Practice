package Backtracking;

public class fillarr {
    public static void change_arr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }

        // kam(recursion)
        arr[i] = val;
        change_arr(arr, i + 1, val + 1);
        arr[i] -= 2;
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        change_arr(arr, 0, 1);
        printarr(arr);

    }

}
