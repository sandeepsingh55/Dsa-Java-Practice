public class rotate {
    // we can also use one function of rverse arry and use three times by passing
    // different parametr for three times
    public static void rotate_array(int arr[], int d) {
        int start = 0;
        int end = d - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        int s = d;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[end];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }
        int e1 = arr.length - 1;
        while (start < e1) {
            int temp = arr[e1];
            arr[e1] = arr[start];
            arr[start] = temp;
            start++;
            e1--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array after rotation " + arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6 };
        rotate_array(arr, 3);

    }

}
