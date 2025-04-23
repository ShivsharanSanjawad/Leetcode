class Solution {
    public int countLargestGroup(int n) {
        int a[] = new int[37] ; 
        for(int i=1;i<=n;i++){
            int x  = i ;
            int sum = 0 ;
            while(x>0){
                sum += x%10 ; 
                x = x/10 ; 
            }
            a[sum]++ ;
        }
        int max = -1 ; 
        int count = 0 ; 
        for(int i=0;i<37;i++){
            if(max<a[i]){
                max = a[i];
                count = 1 ;
            }else if(max==a[i]){
                count++ ;
            }
        }
        return count ;
    }
}