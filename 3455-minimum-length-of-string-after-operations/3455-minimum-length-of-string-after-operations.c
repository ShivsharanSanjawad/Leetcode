int minimumLength(char* s) {
    int a[26] ; 
    int i ;
    for( i = 0 ;s[i]!=0;i++){
        a[s[i]-97]++ ;
    }
    int count = i ; 
    for(i= 0;i<26;i++){
        if(a[i]>=3){
            int x = (a[i]-3)>>1 ; 
            count -= (x+1)<<1 ;
        }
    }
    return count ;
}