int minChanges(char* s) {
    int count = 0 ; 
    int flag  = 0 ; 
    int n = strlen(s) ; 
    for(int i = 0 ; i<n ; ){
        int ch = s[i] ; 
        int temp =  flag;
        while(ch==s[i]){
            i++ ;
            temp++  ;
        }
        if(temp&1==1){
            s[i-1] = s[i] ; 
            flag = 1 ; 
            count ++ ;
        }else flag = 0 ;
    }
    return count ;
}