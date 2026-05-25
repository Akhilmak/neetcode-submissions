class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m1=new HashMap<>();
        for(String s:strs){
            char[] c1=s.toCharArray();
            Arrays.sort(c1);
            String sorted=new String(c1);
            m1.putIfAbsent(sorted, new ArrayList<>());
            m1.get(sorted).add(s);
        }
        return new ArrayList<>(m1.values());
    }
}
