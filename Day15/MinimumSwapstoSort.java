// https://www.geeksforgeeks.org/problems/minimum-swaps/1

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
           int n = nums.length;
        int swapsmin =0 ;
        HashMap<Integer,Integer>orignali = new HashMap<>();
        
        for(int i =0 ;i<n;i++){
              orignali.put(nums[i], i);
        }
        Arrays.sort(nums); // sorted the array 
      for(int i =0 ;i<n;i++){
        while(orignali.get(nums[i]) != i){
            swapsmin++;
            int swapvar = nums[i]; // storing current 
            int timepasss = orignali.get(nums[i]);
            nums[i]= nums[timepasss];
            nums[timepasss]=swapvar;
                  orignali.put(swapvar, timepasss); // updating the hasmap 

        }
  }

      return swapsmin;
    }
}