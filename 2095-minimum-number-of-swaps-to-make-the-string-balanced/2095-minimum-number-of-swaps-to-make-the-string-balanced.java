class Solution {
    public int minSwaps(String s) {
        int a[] = new int[s.length()] ;
        Stack<Integer> st = new Stack<>() ; 
        int x = 0 ; 
        for(int i = 0 ; i<a.length ; i++){
            a[i] = s.charAt(i)==']' ? ++x : --x ; 
            if(s.charAt(i)=='['){
                st.push(i) ; 
            }
        }
        int count =0; 
        int k  = 0 ;
      //  System.out.println(Arrays.toString(a)) ;
        for(int i = 0 ;i<a.length ; i++){
            if(a[i]>k){
                if(st.size()>0){
                    if(st.peek()>i){
                        count++ ; 
                        st.pop() ; 
                        k+=2 ;
                    }
                }
            }
        }
        return count ;
    }
}