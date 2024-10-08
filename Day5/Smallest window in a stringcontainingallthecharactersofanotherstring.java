// https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1

class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
     public static String smallestWindow(String s, String p)
    {
        int si = 0, ei = 0, ns = s.length() , req = p.length(), head = -1; 
        int min = Integer.MAX_VALUE;
        int arr[] = new int[128];
        
        for(int i = 0; i < req; i++){
            arr[p.charAt(i)]++;
        }
        
        while(ei<ns){
            if(arr[s.charAt(ei)]>0){
                req--;
            }
            arr[s.charAt(ei)]--;
            ei++;
            
            while(req==0){
                if(ei-si<min){
                    min = ei-si;
                    head = si;
                }
                
                if(arr[s.charAt(si)]==0){
                    req++;
                }
                
                arr[s.charAt(si)]++;
                si++;
            }
        }
        return min == Integer.MAX_VALUE ? "-1" : s.substring(head,head+min);
    }
}