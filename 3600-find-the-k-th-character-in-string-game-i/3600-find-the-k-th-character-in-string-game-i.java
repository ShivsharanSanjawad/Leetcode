class Solution {
    public char kthCharacter(int k) {
    //     StringBuilder s = new StringBuilder();
    //     s.append("a");
    //     int x = get(k) ;
    //     while(x-->0){
    //         s.append(get2(s.toString()));
    //     }
    //    // System.out.println(s);
    //     return s.toString().charAt(k-1);
        return (char)('a'+Integer.bitCount(k-1));
    }
    public int get(int k){
        if(k<2){
            return 1;
        }
        return 1+get(k>>1);
    }
    public String get2(String s){
        char[] c = new char[s.length()];
        for(int i=0;i<s.length();i++){
            int x = (s.charAt(i) -'a' + 1)%26+ 97 ;
            c[i] = (char)x;
        }
        return new String(c);
    }
}