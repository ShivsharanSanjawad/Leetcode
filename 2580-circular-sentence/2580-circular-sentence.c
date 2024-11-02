bool isCircularSentence(char* s) {
    int n = strlen(s) -1 ; 
    if(s[0]!=s[n]){
        return 0 ; 
    }
    int prev = 0 ;
    for(int i = 0 ; i<n ;i++){
        if(s[i]==32){
            if(s[i+1]!=prev){
                return 0 ;
            }
        }
        prev = s[i] ; 
    }
    return 1 ;
}