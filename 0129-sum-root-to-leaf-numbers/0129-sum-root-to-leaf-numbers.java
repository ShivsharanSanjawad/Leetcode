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
    long sum = 0 ; 
    public void get(TreeNode root , long x){
        if(root==null)
        {
           // sum +=x ;
            return ; 
        }
        x = x*10 + root.val ;
        if(root.left==null&&root.right==null){
            sum+=x ; 
            return ;
        }
        get(root.left,x)  ; 
        get(root.right,x) ;
    }
    public int sumNumbers(TreeNode root) {
       get(root,0);
        return (int)sum ;
    }   
}