class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        // i=1 pasun suru karu karan ans[0] nehmi 0 rahil
        for(int i=1;i<=n;i++){
            ans[i]=ans[i>>1]+(i&1);
        }
        return ans;
    }
}
