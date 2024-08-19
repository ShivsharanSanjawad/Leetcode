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
 *     }
 * }
 */
class Solution {
  
    public int deepestLeavesSum(TreeNode root) {
            int x = findmax(root,0) ;
            return get(root,0,x) ; 

    }

    public int findmax(TreeNode root , int x){
        if(root==null)
        return x  ; 
        return Math.max(findmax(root.left,x+1),findmax(root.right,x+1)) ;
    
    }

    public int get(TreeNode root , int c , int x){
        if(root==null){
            return 0 ; 
        }
        if(c==x-1){
            return  root.val ; 
        }
        int z = get(root.left,c+1,x) ;
        int y = get(root.right,c+1,x) ;
        return z+y ; 

    }
}
