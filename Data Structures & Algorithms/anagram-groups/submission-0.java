class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m1=new HashMap<>();
        for(String s: strs){
            char[] sArray=s.toCharArray();
            Arrays.sort(sArray);
            String sorted=new String(sArray);
            m1.putIfAbsent(sorted,new ArrayList<>());
            m1.get(sorted).add(s);
        }
        return new ArrayList<>(m1.values());
    }
}
