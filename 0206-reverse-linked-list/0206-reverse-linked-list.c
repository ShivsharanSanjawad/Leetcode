/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
#define Node struct ListNode* 
struct ListNode* reverseList(struct ListNode* head) {
    if(head==NULL){
        return NULL;
    }
    Node prev = NULL ;
    Node curr = head; 
    Node next = head->next ; 
    while(curr!=NULL){
        curr->next = prev ;
        prev = curr ; 
        curr = next ;
        if(next!=NULL)
        next = next->next ;
    }
    return prev ;
}