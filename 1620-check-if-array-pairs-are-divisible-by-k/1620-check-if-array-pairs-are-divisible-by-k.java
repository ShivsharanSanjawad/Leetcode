class Solution {
    public boolean canArrange(int[] arr, int k) {
        int rem[] = new int[k] ; 
        for(int i = 0 ; i<arr.length ; i++){
            rem[((arr[i]+k)%k+k)%k] +=1 ; 
        }
        if((k-1)%2!=0){
            if(rem[k/2]%2!=0){
                return false ;
            }
           }
        for(int i = 0 ; i<rem.length ; i++){
           if(i==0){
            continue ;
           }
           
            if(rem[i]!=rem[k-i]){
                return false ;
            }
        }
        return true ;
    }
}