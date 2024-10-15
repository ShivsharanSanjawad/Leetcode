class Solution {
    public long minimumSteps(String s) {
        int left = 0 ; 
        int right = s.length() - 1;
        long count =0  ; 
        // I just need no of swaps to make it sorted 
        // so for bubble sort each time i get the element at last (correct)
        // so right is jsut the correct position and the right - left will the no of swaps required to do that . 
        while(left<right){
            if(s.charAt(right)<s.charAt(left)){
                count +=right-left; 
                left ++ ; 
                right-- ;
            }else if (s.charAt(left)==48){
                left ++ ; 
            }else {
                right-- ;
            }
        }
        return count ;
    }
}