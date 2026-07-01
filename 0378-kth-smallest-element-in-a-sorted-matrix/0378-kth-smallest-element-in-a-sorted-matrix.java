import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int[] row : matrix) {
            for (int ele : row) {
                pq.offer(ele);

                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}