// https://leetcode.com/problems/daily-temperatures/description/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int ans [] = new int[n];
        for(int i = n-1;i>= 0;i--){
           
           
            if(st.isEmpty()){
                st.push(i);
                ans[i] = 0;
            }
            else if(temperatures[i] < temperatures[st.peek()]){
               
                 st.push(i);
                 ans[i] = 1;

            }
            else{
                
                while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(i);
                    ans[i] = 0;
                }
                else{
                    ans[i] = st.peek() - i;
                    st.push(i);
                }
            }
        }

        return ans;
    }
}