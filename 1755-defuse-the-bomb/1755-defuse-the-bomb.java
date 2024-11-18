class Solution {
    public int get(int a[] ,int i,int k ){
        int sum = 0 ; 
         i = (i+1)%a.length ;
         //System.out.println(k);
                 while(k>0){
                    ///System.out.println(i+ " "+k+" "+sum);
            sum +=a[i] ; 
            i = (i+1)%a.length ;
            k-- ;
        }
        return sum ;
    }
    public int get2(int a[] , int i  , int k){
        int sum = 0 ; 
        i = ((i-1)+a.length)%a.length ; 
        while(k>0){
            sum +=a[i] ; 
            i = ((i-1)+a.length)%a.length ; 
            k-- ;
        }
        return sum;
    }
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            for(int i = 0 ; i<code.length ;i++){
                code[i] = 0 ; 
            }
            return code ;
        }
        int ans [] = new int[code.length];
        if(k>0){
        for(int i = 0 ;i<code.length ; i++){
            ans[i] = get(code,i,k);
        }
        return ans ;
        }
        else {
            k = - k ;
            for(int i= 0 ; i<code.length ;i++){
                ans[i] = get2(code , i,k) ;
            }
            return ans ;
        }
        
    }
}