
public class revesearr {
    // two sum
    public static int[] twosum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int first = 0;
        int end = arr.length - 1;
        while (first < end) {
            int temp = arr[end];
            arr[end] = arr[first];
            arr[first] = temp;
            first++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // pairs
        for (int i = 0; i < arr.length; i++) {
            int curn = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curn + "," + arr[j] + ")");
            }
            System.out.println();
        }
        // sub array
        // max sub array
        int curr_sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int ed = j;
                for (int k = start; k <= ed; k++) {
                    System.out.print(arr[k] + " ");
                    curr_sum += arr[k];
                }
                System.out.println(curr_sum);
            }
            // System.out.println();
            if (max < curr_sum) {
                max = curr_sum;
            }
        }
        // two sum
        twosum(arr, 6);
        System.out.println("maximun subarray " + max);

    }

}
