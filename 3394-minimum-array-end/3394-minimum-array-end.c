long long minEnd(int n, int x) {
    long long ans = x ; 
    long long temp = ans ; 
    long long y = n-1 ;
    while(y>0){
       long long bit = y&1 ; 
       long long mask = ~temp&(temp+1) ; 
        if(bit==1){
            ans = ans|mask ;
        }
        temp = temp |mask ;
        y = y>>1 ;
    }
    return ans;
}