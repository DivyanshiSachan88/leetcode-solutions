class Solution {
    public int minDeletions(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
     int delete=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                delete++;
            }
        }
    
    return delete;
    }
    
}