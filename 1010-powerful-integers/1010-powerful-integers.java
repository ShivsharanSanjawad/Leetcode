class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int z = 1;
        for(int i = 0 ;z<=bound ; i++){
            int p = 1 ;
            for(int j = 0 ;(z+p)<=bound;j++){
               if(!h.containsKey(z+p)){
                h.put(z+p,0);
               }
               p = p*y ;
               if(y==1){
                break;
               }
            }
            z = z*x ;
            if(x==1)
            break;
        }

         return new ArrayList<Integer>( h.keySet()) ; 
    }
}