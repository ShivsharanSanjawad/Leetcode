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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>() ; 
        PriorityQueue<Long> a = new PriorityQueue<>() ;
        q.add(root) ;
        while(!q.isEmpty()){
            int levelsize = q.size() ; 
            long sum = 0 ; 
            for(int i =0 ; i<levelsize ; i++){
                TreeNode temp = q.poll(); 
                sum +=temp.val ; 
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            a.add(sum);
        }
        int x = a.size() ;
       if(x<k){
        return -1;
       }
       while(x!=k){
         a.poll() ; 
         x--;
       }
       return a.peek() ;
        
    }
}