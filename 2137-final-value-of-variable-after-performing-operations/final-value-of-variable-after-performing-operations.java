class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0 ;
        for (String op : operations){
            if(op . contains ("++")){
                  sum ++;
            }
            else{
                sum --;
            }
        }
        return sum;
    }
}