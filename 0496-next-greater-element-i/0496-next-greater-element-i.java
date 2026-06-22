class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int[] res = new int[n];

       for(int i=0; i<n; i++){
        int j;

        for(j=0; i<nums2.length;j++){
            if(nums2[j] ==nums1[i]){
                break;
            }
        }
        //find next greatar element
        int nextGreater = -1;
        for(int k = j + 1; k<nums2.length; k++){
            if(nums2[k] > nums1[i]){
                nextGreater = nums2[k];
                break;
            }
        }
        res[i] = nextGreater;
       }
       return res;
    }
}