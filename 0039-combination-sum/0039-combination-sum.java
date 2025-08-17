class Solution {
    List<List<Integer>> ans ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>() ;
        get(candidates,target,new ArrayList<>(),0) ;
        return ans ;
    }
    public void get(int []cand,int tar,List<Integer> x,int i){
        if(tar<0) return ; 
        if(tar==0){
            ans.add(new ArrayList<>(x)) ; 
            return ;
        }
        if(i>=cand.length) return ;
        List<Integer> y = new ArrayList<>(x) ;
        get(cand,tar,y,i+1) ;
        y.add(cand[i]) ;
        get(cand,tar-cand[i],y,i) ;
    }

}