class Solution {
    public long get(long  x){
        long sum = 0 ; 
        while(x>0){
            sum +=  x%10 ; 
            x /=10 ; 
        }
        return sum ; 
    }
    public int getLucky(String s, int k) {
        int n = s.length()  ; 
        long sum = 0 ; 
            for(int i = 0 ; i<n ; i++){
                sum += get(s.charAt(i)-'a'+1) ; 
            }
            int  i =1;
            while(i<k){
                System.out.println(sum) ;
                sum = get(sum); 
                i++ ;
            }
            return (int)sum ; 
    }
}