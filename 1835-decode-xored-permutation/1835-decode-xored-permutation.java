class Solution {
    public int[] decode(int[] encoded) {
        int xor  = 0 ; 
        for(int i = 1 ; i<=encoded.length+1 ; i++){
            xor = xor^i ; 
        }
        int temp =  0 ;
        for(int i = 1; i<encoded.length;i+=2){
            temp  = temp ^encoded[i] ; 
        }
        int [] decoded = new int[encoded.length+1] ; 
        decoded[0] = temp^xor ; 
        for(int i = 1 ;i<=encoded.length;i++){
            decoded[i] = encoded[i-1]^decoded[i-1] ;
        }
        return decoded ;
    }
}