class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int n = nums.size();

        for (int start = 0; start < n; start++) {
            int sum = 0;

            for (int length = 1; length <= r && start + length <= n; length++) {
                sum += nums.get(start + length - 1);

                if (length >= l && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}