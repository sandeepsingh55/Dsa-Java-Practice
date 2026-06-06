
public class arry {
    /// linear search
    public static int linerar(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /// largest element in array
    public static void largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }
        System.out.println(largest);
        System.out.println(smallest);

    }

    public static void main(String[] args) {
        // int arr[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        int arr[] = { 15, 78, 45, 2, 6, 78, 22 };
        int target = 78;
        int index = linerar(arr, target);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println(" tagert is at index" + index);
        }
        // int temp;
        // sorting array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        largest(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start >= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("element found");
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }

        }

    }
}
