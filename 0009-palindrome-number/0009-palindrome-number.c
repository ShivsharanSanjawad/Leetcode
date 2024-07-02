bool isPalindrome(int x) {
    if(x<0)
    return 0 ; 
    char s[20] ; 
    sprintf(s,"%d",x) ; 
    int count = 0 ; 
    while(x>0)
    {
        x = x/10 ; 
        count++ ; 
    }
    for(int i  = 0 ; i <count/2 ; i++)
    {
        if(s[i]!=s[count-1-i])
          return 0 ;
    }
    return 1 ; 
}