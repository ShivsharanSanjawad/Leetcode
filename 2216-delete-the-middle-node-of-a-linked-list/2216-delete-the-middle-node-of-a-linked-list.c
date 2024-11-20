/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
#define Node struct ListNode*
#define null NULL
Node get(Node head){
    Node slow = head;
    Node fast = head ;
    Node prev = null ;
    while(fast!=null&&fast->next!=null){
        fast = fast->next->next ; 
        prev = slow ; 
        slow = slow->next ;
    }
    return prev;
}
struct ListNode* deleteMiddle(struct ListNode* head) {
    if(head->next==null){
        return null ;
    }
    Node node = get(head);
    node->next = node->next->next ;
    return head;
}