class Solution {
    public char get(char x){
        if(x=='a'){
            return 'b' ;
        }
        return 'a' ;
    }
    public char get2(char x){
        if(x=='c'){
            return 'b';
        }
        return 'c'; 
    }
    public String getHappyString(int n, int k) {
        long total = (1L<<(n-1))*3 ; 
        if(k>total){
            return "";
        }
        if(n==1){
            if(k==1){
                return "a";
            }
            if(k==2){
                return "b" ;
            }
            return "c";
        }
      //  System.out.println(k+" "+total);
        long a[] = new long[n] ;
        for(int i=0;i<a.length;i++){
            a[i] = 1L<<(n-i-1) ;
        }   
        StringBuilder ans = new StringBuilder() ; 
        char prev = 0 ;
        if(k>2*a[0]){
            ans.append('c') ; 
            k -=2*a[0] ;
            prev = 'c';
        }else if(k>a[0]){
            ans.append('b') ;
            k-=a[0] ;
            prev  ='b' ;
        }else{
            ans.append('a');
            prev = 'a' ;
        }
        int i =1 ; 
        while(i<n){
            if(a[i]>=k){
                prev = get(prev) ; 
                ans.append(prev) ;
            }else{
                prev = get2(prev) ;
                ans.append(prev) ;
                k-=a[i];
            }
            i++;
        }
        return ans.toString() ;
    }
}