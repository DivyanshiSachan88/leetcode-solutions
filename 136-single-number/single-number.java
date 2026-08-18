class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int element : nums){
            XOR = XOR ^ element;
        }
        return XOR;
    }
}