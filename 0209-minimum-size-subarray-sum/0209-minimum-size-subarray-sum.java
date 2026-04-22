import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int curr_sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            curr_sum += nums[right];

            while (curr_sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                curr_sum -= nums[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}