class Solution {
    public int largestCombination(int[] c) {
        int max = -1;
        int num = 1 ; 
        int count = 0 ; 
        for(int i = 0 ; i<24 ; i++ ){
            count = 0 ; 
            for(int j = 0 ; j<c.length ;j++){
            if((c[j]&num)==num)
            count ++ ;
            }
            if(count>max){
                max = count ; 
            }
            num  = num<<1 ; 
        }
        return max ;
    }
}