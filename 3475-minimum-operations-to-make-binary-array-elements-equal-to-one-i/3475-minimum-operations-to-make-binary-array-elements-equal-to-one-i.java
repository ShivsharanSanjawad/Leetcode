class Solution {
    public int minOperations(int[] a) {
        int count = 0 ;
        for(int i=0;i<a.length-2;i++){
            if(a[i]==1){
                continue ;
            }
            a[i] = 1 ; 
            a[i+1] ^= 1 ; 
            a[i+2] ^= 1 ;   
            count ++ ; 
        }
        if((a[a.length-1]==a[a.length-2])&&(a[a.length-2]==a[a.length-3])){
            return count ; 
        }
        return -1 ;
    }
}