int isPrefixOfWord(char* s, char* k) {
    int count = 0 ; 
    char prev = ' ';
    for(int i = 0 ;s[i]!=0 ; i++){
        if(prev==' '){
            count ++ ;
            int x = 0 ; 
            while(k[x]!=0&&s[x+i]==k[x]){
                    x++ ;
            }
            if(k[x]==0){
               return count ;
            }   
        }
        prev = s[i] ;
    }
    return -1 ;
}