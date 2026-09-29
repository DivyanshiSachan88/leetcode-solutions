class Solution {
    public String largestNumber(int[] nums) {

        int n = nums.length;
        String[] element = new String[n];

        for (int i = 0; i < n; i++) {
            element[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(element, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

       
        if (element[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (String s : element) {
            ans.append(s);
        }

        return ans.toString();
    }
}

