public class sorting {
    public static void Bubbule_sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {

            for (int j = turn + 1; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void Selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            // position
            for (int j = i + 1; j < arr.length; j++) {
                if (minpos > arr[j]) {
                    minpos = arr[j];
                }
            }
            // swaping
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i - 1;
            // position
            while (prev >= 0 && arr[prev] > cur) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = cur;

        }
    }

    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int conut[] = new int[largest + 1];
        // cout frequency
        for (int i = 0; i < arr.length; i++) {
            conut[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < conut.length; i++) {
            while (conut[i] > 0) {
                arr[j] = i;
                j++;
                conut[i]--;
            }

        }

    }

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 4, 3 };
        Bubbule_sort(arr);
        Selection_sort(arr);
        insertion_sort(arr);
        counting_sort(arr);
        print_arr(arr);

    }
}
