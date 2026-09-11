

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Saare nodes ke values ArrayList me daal do
        for (ListNode list : lists) {
            while (list != null) {
                arr.add(list.val);
                list = list.next;
            }
        }

        // Sort
        Collections.sort(arr);

        // Sorted values se linked list banao
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int value : arr) {
            temp.next = new ListNode(value);
            temp = temp.next;
        }

        return dummy.next;
    }
}