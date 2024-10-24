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
    public boolean check(TreeNode root1 , TreeNode root2){
        if(root1==null&&root2==null){
            return true ;
        }
        if(root1==null||root2==null){
            return false ;
        }
        boolean swap = check(root1.right,root2.right)&&check(root1.left,root2.left);
        boolean nonswap = check(root1.left,root2.right)&&check(root1.right,root2.left);
        return root1.val==root2.val&&(nonswap||swap);
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return check(root1,root2);
    }
}