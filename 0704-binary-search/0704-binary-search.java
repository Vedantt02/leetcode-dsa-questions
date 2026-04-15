class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int high = nums.length - 1;

        while(left <= high){
            int mid = left + (high - left)/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}