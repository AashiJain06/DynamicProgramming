class Solution {
    //Approach - 1 
    public static int minSuperSeq(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
      int[][] dp = new int[n+1][m+1];
      for(int i =0;i<n+1;i++)
      {
          for(int j =0;j<m+1;j++)
          {
              if(i==0 || j==0)
              dp[i][j] = i+j;
              else if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j] = 1 + dp[i-1][j-1];
            else
             dp[i][j] = 1 + Math.min(dp[i][j-1],dp[i-1][j]);
          }
      }
      return dp[n][m];
   //Approach -2 Using LCS
    //  public static int minSuperSeq(String s1, String s2) {
    //      int[][] dp = new int[s1.length()+1][s2.length()+1];
    //      for(int[] row : dp)
    //       Arrays.fill(row,-1);
    //      return solve(s1,s2,s1.length(),s2.length(),dp);
    //  }
    //  public static int solve(String s1, String s2, int n, int m,int dp[][])
    //  {
    //      if(m==0 || n==0)
    //       return n+m;
    //       if(dp[n][m]!=-1)
    //       return dp[n][m];
    //      if(s1.charAt(n-1)==s2.charAt(m-1))
    //      {
    //          return dp[n][m]=1 + solve(s1,s2,n-1,m-1,dp);
    //      }
    //      else
    //       return dp[n][m] =1 + Math.min( solve(s1,s2,n,m-1,dp),solve(s1,s2,n-1,m,dp));
    //  }
}
