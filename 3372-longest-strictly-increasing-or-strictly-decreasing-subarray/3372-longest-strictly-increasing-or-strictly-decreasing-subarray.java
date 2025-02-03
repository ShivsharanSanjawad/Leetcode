class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int max = -1 ; 
        for(int i = 0 ; i<a.length;){
            int j = i ; 
            while(j<(a.length-1)&&a[j]<a[j+1]){
                j++ ; 
            }
            int x = j-i+1 ; 
            if(x>max){
                max = x; 
            }
            i = j+1 ; 
        }
        for(int i = 0 ; i<a.length;){
            int j = i ; 
            while(j<(a.length-1)&&a[j]>a[j+1]){
                j++ ; 
            }
            int x = j-i+1 ; 
            if(x>max){
                max = x; 
            }
            i = j+1 ; 
        }
        return max ;
    }
}