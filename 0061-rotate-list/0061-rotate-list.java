/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
int size = 1 ;  
public ListNode get(ListNode head){
    while(head.next!=null){
        head = head.next  ; 
        this.size++ ;
    } 
    return head ; 
}
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head ;
        }        ListNode temp = head ;
            ListNode tail = get(head) ; 
            int x= this.size - (k%this.size)-1 ; 
            if(k%this.size==0){
                return head ;
            }
            int i = 0 ; 
            while(i<x){
                temp = temp.next ;
                i++ ;
            } 
            tail.next = head ;
            ListNode end = temp.next ;
            temp.next = null ; 
            return end ;
        
    }
}