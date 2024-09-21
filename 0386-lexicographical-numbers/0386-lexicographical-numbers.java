class Solution {
    public List<Integer> lexicalOrder(int n) {
        String a[] = new String[n] ; 
        for(int i = 0 ; i<n ; i++){
            a[i] = Integer.toString(i+1) ; 
        }
        Arrays.sort(a); 
        ArrayList<Integer> ans = new ArrayList<>() ; 
        for(int i = 0 ; i<n ; i++){
            ans.add(Integer.parseInt(a[i])) ; 
        }
        return ans ;

    }
}