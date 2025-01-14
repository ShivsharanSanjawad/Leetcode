class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Long a = 0L ; 
        Long b = 0L ; 
        int ans[] = new int[A.length] ;
        for(int i = 0;i<ans.length;i++){
            a = a^(1L<<A[i]) ; 
            b = b^(1L<<B[i]) ; 
            ans[i] = i + 1 - (Long.bitCount(a^b)>>1) ;
        }
        return ans ;
    }
}