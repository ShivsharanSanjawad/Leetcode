class Solution(object):
    def countBadPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {} 
        for i in range(len(nums)):
            if nums[i]-i not in d :
                d[nums[i]-i] = 1 
            else :
                d[nums[i]-i] +=1 
        x = 0 
        for dic in d.values():
            if(dic!=1):
                 x += dic*(dic-1)/2 
        n = len(nums)
        z = (n*(n-1))/2 
        return z-x


        