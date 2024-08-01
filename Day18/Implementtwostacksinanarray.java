// https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1

class twoStacks {
    int arr[];
    int idx1,idx2;
    
    twoStacks() {
        arr = new int[250];
        idx1 = -1;
        idx2 = 250;
        Arrays.fill(arr,-1);
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        idx1++;
        arr[idx1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        idx2--;
        arr[idx2] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        int ans = -1;
        if(idx1 > -1){
            ans = arr[idx1];
            arr[idx1] = -1;
            idx1--;
        }
        return ans;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        int ans = -1;
        if(idx2 < 250){
            ans = arr[idx2];
            arr[idx2] = -1;
            idx2++;
        }
        return ans;
    }
}