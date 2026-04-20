class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int mod = num % 3;

            if (mod != 0) {
                count += 1;
            }
        }

        return count;
    }
}