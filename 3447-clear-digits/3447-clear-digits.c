char* clearDigits(char* s) {
    int n = strlen(s);
    char *ans  = (char*)malloc(sizeof(char)*(n+1)) ;
    int x = 0 ;
    for(int i=0 ;i<n;i++){
        if((s[i]>96&&s[i]<127)){
            ans[x++] = s[i] ;
        }else {
            if(x>0)
            x-- ;
        } 
    }
    ans[x] = 0 ;
    return ans ;
}