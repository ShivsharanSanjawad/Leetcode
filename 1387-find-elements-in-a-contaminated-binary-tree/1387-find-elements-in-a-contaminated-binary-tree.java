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
class FindElements {
    HashMap<Long ,Long> h ;
    public void get(TreeNode root , long val){
        if(root.left!=null){
            h.put(2*val+1,0L) ;
            get(root.left,2*val+1) ;
        }
        if(root.right!=null){
            h.put(2*val+2,0L) ;
            get(root.right,2*val+2);
        }
    }
    public FindElements(TreeNode root) {
        h = new HashMap<>() ; 
        h.put(0L,0L) ;
        get(root,0) ;
    }
    
    public boolean find(int target) {
        return h.containsKey((long)target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */