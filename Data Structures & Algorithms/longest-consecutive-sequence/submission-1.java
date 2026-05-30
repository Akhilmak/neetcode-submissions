class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int len=0;
        int currLength=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            System.out.println("Left--->"+left+" curr---->"+(left+1));
            System.out.println("Left Num--->"+nums[left]+" nums[curr]---->"+nums[left+1]);
            int curr=left+1;
            
            if(nums[curr]-nums[left]==1){
                currLength++;
            }else if(nums[curr]-nums[left]==0){
                curr++;
            }else{
                currLength=0;
            }
            left++;
            len=Math.max(len,currLength);
            System.out.println("Updated Length--->"+len);
        }
        return len+1;
    }
}
