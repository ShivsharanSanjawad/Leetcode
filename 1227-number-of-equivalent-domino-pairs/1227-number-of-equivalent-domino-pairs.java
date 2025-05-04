class Solution {
    public int numEquivDominoPairs(int[][] d) {
        HashMap<Integer,Integer> h = new HashMap<>() ; 
        for(int i=0;i<d.length;i++){
            int x = d[i][0]*10 + d[i][1] ; 
            int y = d[i][1]*10 + d[i][0] ; 
            if(h.containsKey(x)){
                h.put(x,h.getOrDefault(x,0)+1);
            }else {
                h.put(y,h.getOrDefault(y,0)+1);
            }
        }
        int count = 0 ; 
        for(Integer key:h.keySet()){
            count += h.get(key)*(h.get(key)-1)/2 ; 
        }
        return count ;
    }
}