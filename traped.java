public class traped {
    public static int traped_water(int height[]) {
        int n = height.length;
        // calculate left max sub array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max sub array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // water trap
        int traperWater = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(leftmax[i], rightmax[i]);
            traperWater += water_level - height[i];
        }
        return traperWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(" total water traped " + traped_water(height));
    }
}
