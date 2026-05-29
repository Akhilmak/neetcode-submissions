class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        Map<Character,Character> mp=new HashMap<>();
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');
        for(char t:s.toCharArray()){
            if(mp.containsKey(t)){
                if(!st.isEmpty() && st.peek()==mp.get(t)){
                        st.pop();
                    }else{
                        return false;
                    }

            }else{
                st.push(t);
            }
        }

return st.isEmpty();
        
    }
}
