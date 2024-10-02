import copy
class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        temp = copy.deepcopy(arr) 
        temp.sort()
        d={}
        prev = -10^9 - 1
        x = 0 
        for i in (temp):
            if i not in d :
                x +=1
                d[i] = x 
        ans = []
        for i in range(len(arr)):
            ans.append(d[arr[i]]) 
        return ans  
