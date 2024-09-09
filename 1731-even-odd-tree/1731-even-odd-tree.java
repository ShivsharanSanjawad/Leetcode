/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        // ArrayList<ArrayList<Integer>> a = new ArrayList<>() ;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root.val % 2 == 0) {
            return false;
        }
        int i = 1;
        q.add(root);
        while (!q.isEmpty()) {
            int x = q.size();
            int prev = Integer.MIN_VALUE;
            int prev2 = Integer.MAX_VALUE;
            for (int j = 0; j < x; j++) {
                TreeNode temp = q.poll();

                if (temp.left != null) {
                    q.add(temp.left);
                    if (i % 2 == 1) {
                        if (temp.left.val % 2 == 1)
                            return false;
                        if (temp.left.val >=prev2)
                            return false;
                        prev2 = temp.left.val;
                    }
                    if (i % 2 == 0) {
                        if (temp.left.val % 2 == 0)
                            return false;
                        if (temp.left.val <= prev)
                            return false;
                        prev = temp.left.val;
                    }
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    if (i % 2 == 1) {
                        if (temp.right.val % 2 == 1)
                            return false;
                        if (temp.right.val >= prev2)
                            return false;
                        prev2 = temp.right.val;
                    }
                    if (i % 2 == 0) {
                        if (temp.right.val % 2 == 0)
                            return false;
                       if(temp.right.val<=prev)
                       return false ;
                        prev = temp.right.val;
                    }
                }
            }
            i++;
        }
        return true;
    }
}