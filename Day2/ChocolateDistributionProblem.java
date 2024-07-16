// https://geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int ans = Integer.MAX_VALUE;
        for(int i = m-1;i<n;i++){
            ans = Math.min((a.get(i) - a.get(i - (m-1))),ans);
        }
        return ans;
    }
}