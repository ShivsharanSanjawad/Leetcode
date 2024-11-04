char* compressedString(char* word) {
    char * s = malloc(strlen(word)*sizeof(char)*2 +100) ;
    int x = 0 ;  
    for(int i = 0 ; word[i]!=0;){
        char ch = word[i] ;
        int count = 0 ;
        while(word[i]!=0&&ch==word[i]){
            i++ ; 
            count++ ; 
        }
        while(count>9){
            s[x++] = 9+'0';
            s[x++] = ch ; 
            count -=9 ;
        }
        if(count!=0){
            s[x++] = count+'0';
            s[x++] = ch ;
        }
    }
    s[x] = 0 ; 
    return s ;
}