/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null; 
        }
        root.next = null ;
        return get(root);
    }
    public Node get(Node root){
        if(root==null){
            return null ;
        }
        if(root.left!=null){
            root.left.next = root.right ;
        }
        if(root.next!=null&&root.right!=null){
            root.right.next = root.next.left ;
        }
        get(root.left) ; 
        get(root.right) ;
        return root;
    }
}