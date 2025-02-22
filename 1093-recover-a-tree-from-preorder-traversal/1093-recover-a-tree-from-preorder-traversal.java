/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     
 * }
 */
class Solution {
    public int[] get(String s,int i){
        int depth = 0 ; 
        while(i<s.length()&&s.charAt(i)=='-'){
            i++ ; 
            depth++ ;
        }
        int ans =0 ; 
        while(i<s.length()&&s.charAt(i)!='-'){
            int x = s.charAt(i) -'0' ; 
            ans = ans*10 + x ;
            i++ ;
        }
        return new int[]{depth,ans,i};
    }
    public int generate(String s, int i , TreeNode root,int depth){
        if(i>=s.length()){
            return i ;
        }
        int a[] = get(s,i); 
        if(a[0]==depth){
            root.left = new TreeNode(a[1]) ; 
            int next = generate(s,a[2],root.left,depth+1) ; 
            if(next<s.length()){
                int b[] = get(s,next) ;
                if(b[0]==depth){
                    root.right = new TreeNode(b[1]) ; 
                    return generate(s,b[2],root.right,depth+1);
                }
            }
            return next;
        }
        return i ;
    }
    public TreeNode recoverFromPreorder(String s) {
        int a[] = get(s,0) ; 
        TreeNode root = new TreeNode(a[1]) ;
        generate(s,a[2],root,1);
        return root;
    }
}