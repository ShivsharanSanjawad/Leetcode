class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> in, String[] supplies) {
        HashMap<String,Integer> ans = new HashMap<>() ;
        HashMap<String,Integer> s = new HashMap<>() ; 
        for(int i=0;i<supplies.length;i++){
            s.put(supplies[i],0) ;
        }
        int z = 10 ;
        while(z-->0){
        for(int i=0;i<in.size();i++){
            boolean flag = true ;
            if(ans.containsKey(in.get(i))){
                continue ;
            }
            for(int j=0;j<in.get(i).size();j++){
                if(!s.containsKey(in.get(i).get(j))&&!ans.containsKey(in.get(i).get(j))){
                    flag = false ; 
                    break ;
                }
            }
            if(flag){
                ans.put(recipes[i],0) ;
            }
        }
        }
        ArrayList<String> x = new ArrayList<>() ;
        for(String k:ans.keySet()){
            x.add(k) ;
        }
        return x; 
    }
}