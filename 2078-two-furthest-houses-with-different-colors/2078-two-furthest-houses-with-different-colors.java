class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDis = 0;
               // Compare with first element
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != colors[0]) {
                maxDis = j;
                break;
            }
        }

        // Compare with last element
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDis = Math.max(maxDis, n - 1 - i);
                break;
            }
        }
        return maxDis;
    }
}