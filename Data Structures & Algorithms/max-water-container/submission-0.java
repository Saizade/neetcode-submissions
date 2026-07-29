// brute force
// class Solution {
//     public int maxArea(int[] heights) {
//         int ans=0;
//         for(int i=0;i<heights.length;i++){
//             for(int j=i+1;j<heights.length;j++){
//                int height = Math.min(heights[i], heights[j]);

//                 int width = j - i;

//                 int area = height * width;

//                 ans = Math.max(ans, area);
//             }
//         }
//         return ans;
//     }
// }


// two pointers approach and optimal 
class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int ans=0;
        while(left<right){
            int height=Math.min(heights[left],heights[right]);
            int width=right-left;
            int area=height*width;
            ans=Math.max(ans,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}