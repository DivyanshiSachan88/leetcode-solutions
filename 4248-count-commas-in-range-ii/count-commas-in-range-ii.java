class Solution {
    public long countCommas(long n) {
        long ans = 0 ;
        long place = 1000;
        while (place <=n){
            ans +=(n-place +1);
            place *=1000;
        }
        return ans ;
    }
}