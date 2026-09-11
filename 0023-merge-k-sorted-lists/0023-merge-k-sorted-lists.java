

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    int  n = lists.length;
    //{1--2--3, 6--7--4, 3--2..5}
        List<Integer> li = new ArrayList<>();
        for(int i =0; i<n; i++){ //i-1
        ListNode temp = lists[i]; //imp
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        }
        Collections.sort(li);
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for(int i =0; i<li.size(); i++){
            res.next = new ListNode(li.get(i));
            res = res.next;
        }
        return dummy.next;
    }
}
        
    