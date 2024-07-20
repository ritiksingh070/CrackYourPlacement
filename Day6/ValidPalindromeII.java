// https://leetcode.com/problems/valid-palindrome-ii/description/

class Solution {
    public boolean isPalindrome(StringBuilder s){
        int n = s.length();
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-1-i)) return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        int n = s.length();
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                sb.delete(i,i+1);
                StringBuilder temp = new StringBuilder(s);
                temp.delete(n-1-i,n-i);
                return isPalindrome(sb) || isPalindrome(temp);
            }
        }
        return true;
    }
}