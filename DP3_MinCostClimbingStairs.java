class Solution {
    //Approach1-using Recursion and memorization
    // int[] dp = new int[1001];
    // public int minCostClimbingStairs(int[] cost) {
    //     Arrays.fill(dp,-1);
    //     int min_cost0 = solve(cost,0);
    //     int min_cost1 = solve(cost,1);
    //     return Math.min(min_cost0,min_cost1);      
    // }
    // public int solve(int[] cost,int i)
    // {
    //      if(i>=cost.length)
    //      return 0;
    //      if(dp[i]!=-1)
    //      return dp[i];
    //     int one_step = cost[i] + solve(cost,i+1);
    //     int two_step = cost[i] + solve(cost,i+2);
    //     return dp[i]=Math.min(one_step,two_step);
    // }
     public int minCostClimbingStairs(int[] cost) {
       //Using Bottom-Up
       int n = cost.length;
       for(int i =2;i<n;i++)
       {
        cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);
       }
       return Math.min(cost[n-1],cost[n-2]);
     }
}
