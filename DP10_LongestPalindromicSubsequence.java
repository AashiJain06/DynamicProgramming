 //Approach 1- Using LCS Bottom Up;
    // public int longestPalindromeSubseq(String s) {
    //     StringBuilder str = new StringBuilder(s);
    //     String reverse_str = str.reverse().toString();
    //     int n = s.length();
    //     int m = reverse_str.length();
    //     int[][] dp = new int[n+1][n+1];
    //     for(int i =1;i<=n;i++)
    //     {
    //         for(int j =1;j<=m;j++)
    //         {
    //             if(s.charAt(i-1)==reverse_str.charAt(j-1))
    //              dp[i][j] = 1+dp[i-1][j-1];
    //             else
    //              dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
    //         }
    //     }
    //     return dp[n][m];
    // }


    //Approach 2 - Using Recursion and Memorization;
    
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
         for(int[] row : dp)
         {
           Arrays.fill(row,-1);
         }
        return solve(s,0,s.length()-1,dp);
    }
    public int solve(String s , int i, int j,int[][] dp)
    {
        if(i>j)
         return 0;
        if(i==j)
         return 1;
         if(dp[i][j]!=-1)
          return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
         return dp[i][j] =2 + solve(s,i+1,j-1,dp);
        else
         return dp[i][j] =Math.max(solve(s,i+1,j,dp),solve(s,i,j-1,dp));
    }
}
