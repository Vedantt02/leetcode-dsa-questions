class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        ans=0
        left_value = nums[0]
        for i in range(1,len(nums)-1):
            if left_value < nums[i] and nums[i] > nums[i+1]:
                ans+=1
                left_value = nums[i]
            elif left_value > nums[i] and nums[i]< nums[i+1]:
                ans+=1
                left_value = nums[i]
        return ans
