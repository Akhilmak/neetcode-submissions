class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String ori=sb.toString();
        String rev=sb.reverse().toString();
        return ori.equalsIgnoreCase(rev);
            }

}
