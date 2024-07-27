class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int x = 0; 
        int y = 0 ;
        int i = 0 ; 
        while(i<arr1.length&&i<arr2.length){
            x = x ^arr1[i] ; 
            y = y^arr2[i] ;
            i++ ;
        }
        while(i<arr1.length){
            x = x ^arr1[i] ;
            i++ ;
        }
        while(i<arr2.length){
            y = y^arr2[i] ; 
            i++ ; 
        }
        return y&x ; 
    }
}