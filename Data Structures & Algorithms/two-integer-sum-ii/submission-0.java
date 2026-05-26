class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(m1.containsKey(temp)){
                return new int[]{m1.get(temp),i+1};
            }
            m1.put(nums[i],i+1);
        }
        return new int[0];
    }
}
