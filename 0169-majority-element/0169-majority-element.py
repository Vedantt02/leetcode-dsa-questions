class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d={}
        for i in nums:
            if i in d.keys():
                d[i]+=1
            else:
                d[i]=1
        maxx=0
        key=0
        for i in d.keys():
            if d[i] >maxx:
                maxx =d[i]
                key =i
        return key