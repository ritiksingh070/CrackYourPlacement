// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int leftSmall[] = new int [n];
        int rightSmall[] = new int [n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<n;i++){
            if(st.empty()){
                leftSmall[i] = i;
                st.push(i);
            }
            else{
                while(!st.empty() && heights[i] <= heights[st.peek()] ){
                    st.pop();
                }
                if(!st.empty()){
                    leftSmall[i] = st.peek() + 1;
                    st.push(i);
                   
                }
                else{
                    st.push(i);
                    leftSmall[i] = 0;
                }
                
                
                
            }
        }
        st.clear();
        for(int i = n-1;i>= 0;i--){
            if(st.empty()){
                rightSmall[i] = i;
                st.push(i);
            }
            else{
                while(!st.empty() && heights[i] <= heights[st.peek()] ){
                    st.pop();
                }
                if(!st.empty()){
                    rightSmall[i] = st.peek() - 1;
                    st.push(i);
                   
                }
                else{
                    st.push(i);
                    rightSmall[i] = n-1;
                }
                
                
                
            }
        }

        for(int i = 0;i<n;i++){
            System.out.print(leftSmall[i] + " ");
        }
         System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print(rightSmall[i] + " ");
        }
        int ans = -1;
        for(int i = 0;i<n;i++){
            int area = heights[i] * (rightSmall[i] - leftSmall[i] + 1);
            ans = Math.max(ans,area);
        }
        return ans;

    }
}