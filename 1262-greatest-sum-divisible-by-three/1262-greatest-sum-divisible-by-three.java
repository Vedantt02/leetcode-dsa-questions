class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];

        for (int num : nums) {
            int[] temp = dp.clone();

            for (int i = 0; i < 3; i++) {
                int newSum = temp[i] + num;
                int mod = newSum % 3;

                dp[mod] = Math.max(dp[mod], newSum);
            }
        }

        return dp[0];
    }
}