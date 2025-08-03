class Solution {
    public long minCost(int[] b1, int[] b2) {
        HashMap<Integer,Integer> h = new HashMap<>() ; 
        int min = Integer.MAX_VALUE ; 
        for(int i=0;i<b1.length;i++){
            h.put(b1[i],h.getOrDefault(b1[i],0)+1);
            h.put(b2[i],h.getOrDefault(b2[i],0)-1);
            min = Math.min(min,b1[i]) ; 
            min = Math.min(min,b2[i]) ;
        }
        long cost = 0 ; 
        ArrayList<Integer> x = new ArrayList<>() ;
        for(Integer key:h.keySet()){
            if(h.get(key)%2==1){
                    return -1 ;
            }
            if(h.get(key)!=0){
                for(int i=0;i<Math.abs(h.get(key))/2;i++){
                    x.add(key);
                }
            }
        }
        Collections.sort(x) ;
        for(int i=0;i<x.size()/2;i++){
            cost += Math.min(2*min,x.get(i)) ;
        }
        return cost ;
    }
}