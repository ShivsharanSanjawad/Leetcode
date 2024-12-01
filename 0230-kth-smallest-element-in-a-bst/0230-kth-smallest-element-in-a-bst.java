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
    
    PriorityQueue<Integer> minheap ; 

    public void add(TreeNode root){
        if(root==null){
            return ;
        }
        add(root.left);
        minheap.add(root.val) ; 
        add(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        minheap = new PriorityQueue<>() ; 
        add(root);
        while(k-1>0){
            minheap.poll() ;
            k-- ;
        }
        return minheap.poll();

    }
}