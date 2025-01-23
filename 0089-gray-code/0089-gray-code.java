class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> a = new ArrayList<>() ; 
        for(int i = 0 ; i<(1<<n) ;i++){
            a.add(i^(i>>1)) ;
        }   
        return a ;
    }
}