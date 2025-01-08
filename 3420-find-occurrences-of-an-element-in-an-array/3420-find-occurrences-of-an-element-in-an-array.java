class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> l = new ArrayList<>() ;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==x){
                l.add(i) ;
            }
        }
        int [] ans = new int[queries.length];
        int n = l.size();
        for(int i =0 ;i<queries.length;i++){
            if(queries[i]>n){
                ans[i] = -1 ;
            }else ans[i] = l.get(queries[i]-1) ;
        }
        return ans;
    }
}