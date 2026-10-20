class Solution {
    public boolean judgeSquareSum(int c) {

    int low=0;
    long left=0,right=(long)Math.sqrt(c);
    while(left<=right){
        long sum=left* left+right* right;
        if(sum==c){
            return true;
        }else if(sum<c){
            left++;
        }else{
            right--;
        }
    }
        return false;
    }
}