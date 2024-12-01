class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>() ; 
        for(int i  = 0 ; i<arr.length ; i++){
            h.put(arr[i],i) ; 
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(h.containsKey(2*arr[i])&&h.get(2*arr[i])!=i){
                return true ;
            }
        }
        return false ;
    }
}