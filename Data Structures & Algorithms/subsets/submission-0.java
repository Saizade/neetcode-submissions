class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>current=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,nums,current,ans);
        return ans;
    }
    void solve(int index,int[]nums,List<Integer>current,List<List<Integer>>ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        solve(index+1,nums,current,ans);
        current.remove(current.size()-1);
        solve(index+1,nums,current,ans);
    }
}
