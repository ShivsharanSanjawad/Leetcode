class Solution {
    public String simplifyPath(String path) {
        String [] a = path.split("/");
      //  System.out.println(Arrays.toString(a)) ;
        Stack<String> st = new Stack<>() ; 
       // st.push("/") ; 
        for(int i = 0 ; i<a.length ; i++){
            if(a[i].length()!=0){
                if(a[i].equals("..")){
                    if(!st.isEmpty())
                    st.pop() ; 
                }else if(a[i].equals(".")){

                }else 
                  st.push("/"+a[i]) ;
            }
        }
        if(st.isEmpty()){
            return "/" ;
        }
        String ans = "" ; 
        while(!st.isEmpty()){
            ans =st.pop() +ans;
        }
        return ans ;
    }
}