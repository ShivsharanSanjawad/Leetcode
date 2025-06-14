class Solution {
    public String answerString(String s, int n) {
        if(n==1){
            return s;
        }
        String x = s.substring(0,s.length()-n+1) ;
        for(int i=1;i<n;i++){
            if(more(x,s,i,i+s.length()-n+1)){
                x = s.substring(i,i+s.length()-n+1);
            }
        }
        for(int i=n;i<s.length();i++){
            if(get(s,i,x).length()!=0){
                x = get(s,i,x);
            }
        }
        return x;
    }
    public boolean more(String x ,String w ,int s , int e){
        for(int i=s;i<e;i++){
            if(x.charAt(i-s)>w.charAt(i)){
                return false ;
            }else if(w.charAt(i)>x.charAt(i-s)){
                return true ;
            }
        }
        return true;
    }
    public String get(String s, int i ,String x){
        if(s.charAt(i)>x.charAt(0)){
            return s.substring(i,s.length());
        }
        if(s.charAt(i)<x.charAt(0)){
            return new String() ;
        }
        int temp = i ; 
        int y = 0 ; 
        while(temp<s.length()&&s.charAt(temp)==x.charAt(y)){
            temp++ ; 
            y++ ;
        }
        if(temp==s.length()&&temp-i+1<=x.length()){
            return new String();
        }else if(temp!=s.length()&&s.charAt(temp)<x.charAt(y)){
            return new String();
        }
        return s.substring(i,s.length());
    }
}