class Solution {
    // public int climbStairs(int n) {
    // //    int[] dp = new int[n+1];
    // //    Arrays.fill(dp,-1);
    // //    return solve(n,dp);
    // }
    // //brute - Using Recursion
    // public int solve(int n)
    // {
    //     if(n==0)
    //      return 1;
    //     if(n<0)
    //      return 0;
    //     int one_step = solve(n-1);
    //     int two_step = solve(n-2);

    //     return one_step + two_step;
    // }
    //approach 2 - Using memoization
    // public int solve(int n , int[] dp)
    // {
    //     if(n==0)
    //      return 1;
    //     if(n<0)
    //      return 0;
    //     if(dp[n]!=-1)
    //      return dp[n];
        
    //     int one_step = solve(n-1,dp);
    //     int two_step = solve(n-2,dp);

    //     return dp[n] = one_step + two_step;
    // }
    //approach3-using BottomUp
  public int climbStairs(int n){
    if(n<=3)
     return n;
    int a = 1;
    int b =2;
    int c =3;
    for(int i =3;i<=n;i++)
    {
        c = a+b;
        a =b;
        b =c;
    }
    return c;
  }
}
