class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            for (int n = num; n > 0; n = n / 10) {
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
