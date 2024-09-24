/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node make(int val){
        Node n = new Node(); 
        n.val  = val ; 
        n.prev = null ; 
        n.next = null ; 
        n.child = null ;
        return n ; 
    }
    Node head ; 
    public Node flatten(Node head) {
        if(head==null){
            return null ;
        }
        this.head = make(head.val);
        Node temp = this.head ; 
        get(head) ; 
        temp = temp.next  ;
        temp.prev = null ; 
        return temp ;
    }
    public void get(Node head){
        if(head==null){
            return  ; 
        }
        this.head.next = make(head.val) ; 
        this.head.next.prev = this.head ; 
        this.head = this.head.next ;
        get(head.child) ; 
        get(head.next) ;

    }
}