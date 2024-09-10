class Solution:
    def countDistinctIntegers(self, nums: List[int]) -> int:
        se = {-1,-2} 
        for n in nums :
            s = str(n) 
            se.add(n)
            se.add(int(s[::-1]))
        return len(se)-2
                