//recursion

class Solution {
    
    public boolean isPalindrome(String s) {
        
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = st.length();
        if (len <= 1){
            return true;
        }
        if (st.charAt(0) != st.charAt(len-1)){
            return false;
        }
        
        return isPalindrome(st.substring(1,len-1));
        
    }
}
