class Solution {
    HashMap<Integer, ArrayList<Integer>> dp ; 
    public ArrayList<Integer> get(int []nums,int curr, int prev){
        if(curr>=nums.length){
            return new ArrayList<>() ; 
        }
        int key = prev*1001 + curr ; 
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        ArrayList<Integer> nonChoose = get(nums,curr+1,prev) ;
        ArrayList<Integer> choose = new ArrayList<>() ;
        if(prev==-1||nums[curr]%nums[prev]==0){
            choose.add(nums[curr]);
            choose.addAll(get(nums,curr+1,curr)) ;
        }
        ArrayList<Integer> ans = choose.size()>nonChoose.size()?choose:nonChoose ;
        dp.put(key,ans) ;
        return  ans; 
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums) ;
        dp = new HashMap<>() ;
        return get(nums,0,-1) ; 
    }
}