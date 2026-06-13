class Solution {
    public int maxArea(int[] heights) {
        int maxRes=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int vol=Math.min(heights[left],heights[right])*(right-left);
            maxRes=Math.max(vol,maxRes);
            if(heights[left]<heights[right]){
                left++;
            }else if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxRes;
    }
}
