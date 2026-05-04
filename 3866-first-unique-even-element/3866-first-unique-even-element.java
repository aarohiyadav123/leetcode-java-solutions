
class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // first unique even number
        for (int key : map.keySet()) {
            if (key % 2 == 0 && map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}