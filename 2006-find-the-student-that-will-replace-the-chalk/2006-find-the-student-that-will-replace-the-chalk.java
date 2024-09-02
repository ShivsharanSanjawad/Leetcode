class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long [] prev = new long[chalk.length] ; 
        for(int i = 0 ; i<chalk.length ; i++){
            if(i==0)
            {
                prev[i] = 0 ; 
                continue ;
            }
            prev[i] = prev[i-1]+ chalk[i-1] ; 
        }
     //  System.out.println(Arrays.toString(prev)) ;
        long total = prev[prev.length-1]+chalk[chalk.length-1] ; 
       int z = (int)(k/total) ; 
       k -= total*z ;
        int s = 0 ; 
        int e = chalk.length -1 ;
        int ans = 0 ;
        while(e>=s){
            int mid = s + (e-s)/2 ; 
            if(prev[mid]<k){
                s = mid + 1 ;
                ans = mid ;
            }else if(prev[mid]>k){
                e = mid -1 ;
              // ans = mid ; 
            }else{
                return mid ; 
            }
        }
        return ans ; 
    }
}