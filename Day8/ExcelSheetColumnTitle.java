// https://leetcode.com/problems/excel-sheet-column-title/description/

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){

            
            sb.append( (char)(65 + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1)/26;
        }
        return sb.reverse().toString();
    }
}