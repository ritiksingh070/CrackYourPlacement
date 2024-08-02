// https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int temp = 1;
        for(int i = 0;i<size;i++){
            if(arr[i] > 0 ){
                if(arr[i] == temp)
                    temp++;
                else if(arr[i] == temp -1) continue;
                else{
                    return temp;
                }
            }
        }
        return temp;
    }
}
