public class prefix {
    public static void prefix_sum(int arr[]) {
        int curr_sum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                // for (int k = start; k < end; k++) {
                // System.out.println(arr[k] + " ");
                // curr_sum += arr[k];
                curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (max < curr_sum) {
                    max = curr_sum;
                }
                // }
                System.out.println();
            }
        }
        System.out.println("maximum sub arry " + max);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        prefix_sum(arr);
        // kadne's alogorithm
        int c_sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            c_sum += arr[i];
            if (c_sum < 0) {
                c_sum = 0;
            }
            max = Math.max(c_sum, max);
        }
        System.out.println("maximum subarray " + max);

        // secnd largest element
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        System.out.println("maximum element in array" + mx);
        // second maximun array
        int sc = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sc && arr[i] != mx) {
                sc = arr[i];
            }
        }
        System.out.println("second largest element in array " + sc);

        /// segerated array
        int arr2[] = { 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1 };
        int i = 0;
        int trav = 0;
        while (trav != arr2.length) {
            if (arr2[trav] == 0) {
                int temp = arr2[i];
                arr2[i] = arr2[trav];
                arr2[trav] = temp;
                i++;
                trav++;
            } else {
                trav++;
            }
            System.out.println(trav);
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k]);
        }
    }
}
