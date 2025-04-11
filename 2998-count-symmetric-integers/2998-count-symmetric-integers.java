class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0 ; 
        for(int i=low;i<=high;i++){
            String x = Integer.toString(i) ; 
            if(x.length()%2==1){
                continue ; 
            }
            int sum = 0 ; 
            for(int j =0;j<x.length()/2 ;j++){
                sum +=x.charAt(j) ; 
            }
            for(int j=x.length()/2;j<x.length();j++){
                sum -=x.charAt(j) ; 
            }
            if(sum==0){
                count++ ;
            }
        }
        return count ; 
    }
}