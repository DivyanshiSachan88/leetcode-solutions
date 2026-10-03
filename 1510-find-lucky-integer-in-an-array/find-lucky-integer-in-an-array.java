class Solution {
    public int findLucky(int[] arr) {
        int lucky=-1;
        for(int i=0;i<arr.length;i++){
            int freq=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            if(arr[i]==freq){
                lucky=Math.max(lucky,arr[i]);

            }
        }
        return lucky;
    }
}