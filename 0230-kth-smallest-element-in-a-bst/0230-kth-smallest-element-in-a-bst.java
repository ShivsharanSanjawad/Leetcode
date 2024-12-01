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
    
    ArrayList<Integer> a ; 

    public void add(TreeNode root){
        if(root==null){
            return ;
        }
        add(root.left);
        a.add(root.val) ; 
        add(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        a = new ArrayList<>() ;
        add(root);
        return a.get(k-1);
    }
}