class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> currLi = new ArrayList<>();

        powSet(nums, currLi, 0, finalList);

        return finalList;
    }

    public void powSet(int[] nums, List<Integer> currLi, int idx,
                       List<List<Integer>> finalList) {

        if (idx == nums.length) {
            finalList.add(new ArrayList<>(currLi)); // copy add karna hai
            return;
        }

        // Pick
        currLi.add(nums[idx]);
        powSet(nums, currLi, idx + 1, finalList);
        currLi.remove(currLi.size() - 1);

        // Not Pick
        powSet(nums, currLi, idx + 1, finalList);
    }
}