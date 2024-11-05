int minChanges(char* s) {
    if(s[0]==0) return 0 ;
  return (s[0]!=s[1]) +  minChanges(s+2) ;
}