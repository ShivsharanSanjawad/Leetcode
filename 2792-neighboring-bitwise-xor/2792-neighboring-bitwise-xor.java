class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int x = 0 ; 
        for(int i = 0 ;i<derived.length ; i++){
            x = x^derived[i] ;
        }
        return x==0 ; 
    }
}