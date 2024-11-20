/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
#define Node struct ListNode*


Node reverse(Node head){
    if(head==NULL){
        return NULL ;
    }
    Node prev = NULL ; 
    Node curr = head;
    Node next = head->next  ;
    while(curr!=NULL){

        curr->next = prev ; 
        prev = curr ; 
        curr = next ; 
        if(next!=NULL){
            next= next->next;
        }
    }
    return prev;
}

Node mid(Node head){
    Node slow  = head ;
    Node fast = head ;
    while(fast!=NULL&&fast->next!=NULL){
        slow = slow->next ; 
        fast = fast->next->next ;
    }
    return slow ;
}

bool isPalindrome(struct ListNode* head) {
     Node temp = mid(head);
    Node   reversed = reverse(temp);
        temp = reversed ; 
        while(temp!=NULL){
            if(temp->val!=head->val){
                return false;
            }
            temp = temp->next;
            head = head->next;
        } 
        return true;

}