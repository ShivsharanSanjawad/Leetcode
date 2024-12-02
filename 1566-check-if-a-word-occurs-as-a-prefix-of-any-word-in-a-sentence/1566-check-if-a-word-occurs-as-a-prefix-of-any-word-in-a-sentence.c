int isPrefixOfWord(char* s, char* k) {
    int count = 1 ; 
    int x = 0 ; 
    while(k[x]!=0&&s[x]==k[x]){
            x++ ;
        }
        if(k[x]==0)
            return count ;
    
    for(int i = 0 ;s[i]!=0 ; ){
        if(s[i]==' '){
            count ++ ; 
            i++ ;
            int x = 0 ; 
                while(k[x]!=0&&s[x+i]==k[x]){
                    x++ ;
                }
                    if(k[x]==0){
                      return count ;
                    }
                }
        else i++;
    }
    return -1 ;
}