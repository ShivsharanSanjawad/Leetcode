class Solution {
    HashMap<Integer,ArrayList<Integer>> h ; 
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        h = new HashMap<>() ; 
        ArrayList<Integer> x = get(groups,0,-1) ; 
        List<String> ans = new ArrayList<>() ; 
        for(int i=0;i<x.size();i++){
            ans.add(words[x.get(i)]);
        }
        return ans ;
    }
    public ArrayList<Integer> get(int [] groups,int i,int prev){
        if(i==groups.length){
            return new ArrayList<>();
        }
        int x = (i<<16) + prev ;
        if(h.containsKey(x)){
            return new ArrayList<>(h.get(x));
        }
        ArrayList<Integer>nonInclude = get(groups,i+1,prev);
        ArrayList<Integer> include = new ArrayList<>() ; 
        if(prev!=groups[i]){
            include = get(groups,i+1,groups[i]) ;  
            include = new ArrayList<>(include);
            include.add(0,i) ;
        }
        if(include.size()>nonInclude.size()){
            h.put(x,include) ; 
            return include ;
        } 
        h.put(x,nonInclude) ; 
        return nonInclude ;
    }
}