class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] resArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int res=1;
            int left=0;
            int right=nums.length-1;
            while(left<=right){
                if(left!=i){
                    res*=nums[left];
                }
                left++;
            }
            resArray[i]=res;
        }
        return resArray;
    }
}  
