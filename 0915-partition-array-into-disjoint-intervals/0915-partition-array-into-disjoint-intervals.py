class Solution:
    def partitionDisjoint(self, nums: List[int]) -> int:
        leftMax = nums[0]
        currMax = nums[0]
        partition = 0

        for i in range(len(nums)):
            currMax = max(currMax, nums[i])
        
            if nums[i] < leftMax:
                partition = i
                leftMax = currMax

        return partition + 1