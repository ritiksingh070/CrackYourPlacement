// https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int n = S.length();
        for(int i = 0;i<n;i++){
            char ch = S.charAt(i);
            
            if(Character.isDigit(ch)){
                st.push(ch - '0'); 
            }
            else{
                int firstOperand = st.pop();
                int secondOperand = st.pop();
                
                switch(ch){
                    case '+' :
                        st.push(secondOperand + firstOperand);
                        break;
                    
                    case '-' :
                        st.push(secondOperand - firstOperand);
                        break;
                        
                    case '*' :
                        st.push(secondOperand * firstOperand);
                        break;
                    
                    case '/' :
                        st.push(secondOperand / firstOperand);
                        break;
                }
            }
        }
        
        return st.pop();
    }
}