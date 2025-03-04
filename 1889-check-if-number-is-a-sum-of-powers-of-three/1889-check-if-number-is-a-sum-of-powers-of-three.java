class Solution {
    HashMap<Integer,Integer> h ;
    public boolean checkPowersOfThree(int n) {
        h = new HashMap<>() ;
        return get(n);
    }
    public boolean get(int n){
        if(n<2){
            return true ;
        }
        if(n==2){
            return false ;
        }
        int x = 0 ; 
        int temp = n; 
        while(temp>0){
            temp /=3 ; 
            x++ ;
        }
        x-- ; 
        if(h.containsKey(x)){
            return false ;
        }
        h.put(x,0);
        //System.out.println(x);
        return get(n-(int)Math.pow(3,x));
    }
}