class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor = 0;

        // अगर nums1 की length odd है
        // तो nums2 के सारे elements XOR होंगे
        if (n % 2 != 0) {
            for (int i = 0; i < m; i++) {
                xor ^= nums2[i];
            }
        }

        // अगर nums2 की length odd है
        // तो nums1 के सारे elements XOR होंगे
        if (m % 2 != 0) {
            for (int i = 0; i < n; i++) {
                xor ^= nums1[i];
            }
        }

        return xor;
    }
}