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
    ListNode head ;
    public void remove(int i){
        if(i==0){
            head = head.next ;
        }
        ListNode temp = head ;
        while(i-1>0){
            temp = temp.next ;
            i-- ;
        }
        temp.next = temp.next.next ;
    }

    public void add(int i,int n){
        if(i==0){
            ListNode node = new ListNode(n) ;
            node.next = head ;
            head = node ;
            return ;
        }
        ListNode temp = head ;
        while(i-1>0){
            temp = temp.next ;
            i-- ;
        }
        ListNode node = new ListNode(n) ;
        node.next = temp.next;
        temp.next = node ;
    }
    public void print(){
        ListNode temp = head ;
        while(temp!=null){
            System.out.print(temp.val+"->") ;
            temp  = temp.next ;
        }
        System.out.println("END");
    }
    public ListNode swapPairs(ListNode head) {
        this.head = head ;
        if(head==null)
        return null ;
        ListNode temp = head ;
        int val ;
        int i = 0 ;
        while(temp!=null){
            if(temp.next==null){
                return this.head ;
            }
            val = temp.next.val ;
            remove(i+1) ; 
            add(i,val) ;
            i +=2 ;
            print() ;
                temp = temp.next ;
        }
        return this.head ;
    }
}