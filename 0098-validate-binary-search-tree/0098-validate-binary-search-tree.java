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
    boolean flag = true ; 
    int j = 0 ;
    public void inorder(TreeNode root){
        if(root==null){
            return  ; 
        }
        inorder(root.left) ; 
        if(pre>=(long)root.val&&j!=0){
            this.flag = false ;
        }else this.pre = root.val ;
        j++ ;
        inorder(root.right) ; 
        
      //  j++ ; 
    }
    long pre = Integer.MIN_VALUE   ; 
    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right==null)
        return true ;
       inorder(root) ;
       return flag;
    }
}