class Solution {
    HashMap<Long,Long> dp ;
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
       dp = new HashMap<>() ;
       return get(nums,k,0,1);
    }
    public long get(int []nums,int k,int i,int isEven){
        if(i==nums.length){
            return isEven==1?0:Long.MIN_VALUE ; 
        }
        long x = (i<<15)|isEven ; 
        if(dp.containsKey(x)){
            return dp.get(x) ;
        }
        long choose = (nums[i]^k) + get(nums,k,i+1,isEven^1) ; 
        long nonChoose = nums[i] + get(nums,k,i+1,isEven); 
        long y = Math.max(choose,nonChoose) ;
        dp.put(x,y) ; 
        return y ;
    }
}