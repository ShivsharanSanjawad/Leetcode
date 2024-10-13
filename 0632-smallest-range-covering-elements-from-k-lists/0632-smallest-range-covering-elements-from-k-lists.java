// got the idea but was not able to implement,so done with editorial
class Solution {

    public int[] smallestRange(List<List<Integer>> nums) {
       List<int[]> a = new ArrayList<>() ; 
       for(int i =0 ; i<nums.size() ; i++){
             for(int j =0 ; j<nums.get(i).size() ;j++ ){
                a.add(new int[]{nums.get(i).get(j),i}); 
             }
       }
       Collections.sort(a,(x,y)->Integer.compare(x[0],y[0]));
       HashMap<Integer , Integer> h = new HashMap<>() ; 
       int l = 0 ;
       int r = 0 ;  
       int count = 0 ; 
       int fs = 0 ; 
       int fe = Integer.MAX_VALUE ; 
       for(r = 0 ; r<a.size() ; r++){
            if(h.get(a.get(r)[1])!=null){
                h.put(a.get(r)[1],h.get(a.get(r)[1])+1) ; 
            }else h.put(a.get(r)[1],1) ;
            if(h.get(a.get(r)[1])==1)
                 count ++ ;

            while(count==nums.size()){
                int curr =a.get(r)[0] -a.get(l)[0] ; 
                if(curr<(fe-fs)){
                    fe = a.get(r)[0] ; 
                    fs = a.get(l)[0] ; 
                }
                h.put(a.get(l)[1],h.get(a.get(l)[1])-1) ;
                if(h.get(a.get(l)[1])==0)
                    count -- ;
                l++ ;
            }
       }
       return new int[]{fs,fe} ;
    }
   
}