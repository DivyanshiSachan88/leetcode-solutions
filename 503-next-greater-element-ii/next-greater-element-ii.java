


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] nge = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nge[i] = -1;

            for (int step = 1; step < nums.length; step++) {
                int j = (i + step) % nums.length;

                if (nums[j] > nums[i]) {
                    nge[i] = nums[j];
                    break;
                }
            }
        }

        return nge;
        
    }
}