int isPrefixOfWord(char* s, char* k) {
    int count = 1 ; 
    for(int i = 0 ;s[i]!=0 ; ){
        if(s[i]==' '||i==0){
            if(i)
                count ++ ; 
                if(i)
                i++ ;
                int x = 0 ; 
            while(k[x]!=0&&s[x+i]==k[x]){
                x++ ;
            }
            if(k[x]==0){
                return count ;
        }
        }else i++;
        if(i==0){
            i++ ;
        }
        
       
    }
    return -1 ;
}