class Solution {
    public int numberOfArrays(int[] d, int lower, int upper) {
        long min = 0 ; 
        long max = 0; 
        long sum = 0 ;
        for(int i=0;i<d.length;i++){
                sum += d[i] ;
                if(sum<min){
                    min = sum ; 
                }else if(sum>max){
                    max = sum ; 
                }
        }
        int x= upper-lower ; 
        long y = max-min ; 
        if(y>x){
            return 0 ;
        }
        return  (upper-lower+1)-((int)y) ;
    }
}