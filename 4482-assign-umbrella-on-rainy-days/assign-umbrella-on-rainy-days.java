class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String[]ans=new String[n];

        int alicec=0;
        int bobc=0;
        for(int i=0;i<n;i++){
            boolean aliceNeeds=i<n-1 && rain[i]==1 && 
                rain[i+1]==1;
            boolean bobNeeds=rain[i]==1;
            if(aliceNeeds && bobNeeds){
                if(alicec<=bobc){
                    ans[i]="Alice";
                    alicec++;
                    
                }else{
                    ans[i]="Bob";
                    bobc++;
                }
            }else if(aliceNeeds){
                ans[i]="Alice";
                alicec++;
                
            }else if(bobNeeds){
                ans[i]="Bob";
                bobc++;
            }else{
                ans[i]="None";
            }
        }
        return ans;
    }
}