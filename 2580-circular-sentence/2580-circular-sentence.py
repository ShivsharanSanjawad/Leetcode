class Solution:
    def isCircularSentence(self, s: str) -> bool:
        n = len(s) 
        if(s[0]!=s[n-1]):
            return False
        prev =" "
        for i in range(n-1):
            if(s[i]==" "):
                if(s[i+1]!=prev):
                    return False 
            prev = s[i]
        return True 