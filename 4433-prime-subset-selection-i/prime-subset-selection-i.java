class Solution {
    public List<Integer> maxPrimes(int n, int s) {

        List<Integer> result = new ArrayList<>();
        int currsum = 0;
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                //  result.add(i);
                if (currsum + i <= s) {
                    currsum += i;
                    result.add(i);
                } else {
                    break;
                }
            }
        }
        return result;

    }

    public  boolean isprime(int n) {

        //boolean isprime=true;
        if (n <2) {
            return false;
        }
        for (int j = 2; j*j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;

    }
}