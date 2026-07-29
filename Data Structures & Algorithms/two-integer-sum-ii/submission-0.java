// TC O(n) SC O(n)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int result=target-nums[i];
//             if(map.containsKey(result)){
//                 return new int[]{map.get(result)+1,i+1};
//             }
//             map.put(nums[i],i);
//         }
//         return new int[]{};
//     }
// }



// // TC O(n) SC O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left+1,right+1};
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
    }
}