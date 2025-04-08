class Solution {
    public int minimumOperations(int[] nums) {
        int [] freq = new int[101] ; 
        Arrays.fill(freq,-1) ;
        int max = -1 ; 
        for(int i=0;i<nums.length;i++){
             if(freq[nums[i]]==-1){
                freq[nums[i]] = i ; 
             }else {
                if(max<freq[nums[i]]){
                    max = freq[nums[i]] ;
                }
                freq[nums[i]] = i ; 
             }
        }
      //  System.out.println(max+" "+Arrays.toString(freq));
        return (int)Math.ceil((max+1)/3.0) ; 
    }
}