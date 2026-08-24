class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> li = new ArrayList<>();

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null) {
            li.add(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            li.add(temp2.val);
            temp2 = temp2.next;
        }

        Collections.sort(li);

        ListNode head = new ListNode(0);
        ListNode dummy = head;

        for (int i = 0; i < li.size(); i++) {
            dummy.next = new ListNode(li.get(i));
            dummy = dummy.next;
        }

        return head.next;
    }
}