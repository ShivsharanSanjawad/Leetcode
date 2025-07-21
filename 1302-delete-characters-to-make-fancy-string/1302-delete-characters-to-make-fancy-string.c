char* makeFancyString(char* s) {
    char * ans = (char*)malloc((strlen(s)*2+1)*sizeof(char)) ; 
    int count = 0 ; 
    int i = 0 ;
    int j = 0 ; 
    int n = strlen(s) ;
    while(s[i]!=0){
        char ch = s[i] ; 
        int x= 0 ; 
        while(i<n&&ch==s[i]){
            i++ ; 
            x++ ; 
        }
        if(x==1){
            ans[j++] = ch  ; 
        }else {
            ans[j++] = ch ; 
            ans[j++] = ch ; 
        }
    }
    ans[j] = 0  ; 
    return ans ;

}