class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer>stack=new Stack<>();
        // right smaller
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        stack.clear();
        // left smaller
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        // ab ans nikalenge
        int ans=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int currArea=heights[i]*width;
            ans=Math.max(ans,currArea);
        }
        return ans;
    }
}
