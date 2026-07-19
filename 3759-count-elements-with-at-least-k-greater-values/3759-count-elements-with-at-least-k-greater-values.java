
class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int low = i + 1;
            int high = n - 1;
            int firstGreater = n;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] > nums[i]) {
                    firstGreater = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int greaterCount = n - firstGreater;

            if (greaterCount >= k) {
                ans++;
            }
        }

        return ans;
    }
}