class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i:nums){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->m1.get(b)-m1.get(a));
        pq.addAll(m1.keySet());
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }
}
