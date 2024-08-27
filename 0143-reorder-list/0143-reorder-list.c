/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mid(struct ListNode* head) {
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow;
}

struct ListNode* reverse(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* next = (curr != NULL) ? curr->next : NULL;
    while (curr != NULL) {
        curr->next = prev;
        prev = curr;
        curr = next;
        if (next != NULL) {
            next = next->next;
        }
    }
    return prev;
}

void reorderList(struct ListNode* head) {
    if (head->next == NULL) {
        return;
    }
    struct ListNode* midNode = mid(head);
    struct ListNode* rev = reverse(midNode);
    struct ListNode* temp = head;
    struct ListNode* prev = temp;
    struct ListNode* next = temp->next;
    struct ListNode* x = NULL;
    while (temp != midNode) {
        temp->next = rev;
        x = rev->next;
        rev->next = next;
        prev = temp;
        temp = next;
        rev = x;
        next = (next != NULL) ? next->next : NULL;
    }
    if (temp != NULL) {
        temp->next = NULL;
    }
}

