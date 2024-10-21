class Solution:
    def maxUniqueSplit(self, s: str) -> int:
        def solve(n,curr_set):
            if(n==len(s)):
                return 0 
            ma = 0
            
            for i in range(n,len(s)):
                string = s[n:i+1]
                if string in curr_set :
                    continue 
                curr_set.add(string)
                ma = max(ma,1+solve(i+1,curr_set))
                curr_set.remove(string)
            return ma 
        return solve(0,set())