class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // fast ko n steps aage le jao
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // dono ko move karo
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // node delete karo
        slow.next = slow.next.next;

        return dummy.next;
    }
}