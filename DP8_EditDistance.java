class Solution {
    //Approach -1
    // public int minDistance(String word1, String word2) {
    //   int n = word1.length();
    //   int m = word2.length();
    //   int[][] dp = new int[n+1][m+1];
    //   for(int i =0;i<n+1;i++)
    //   {
    //     for(int j =0;j<m+1;j++)
    //     {
    //         if(i==0 || j==0)
    //          dp[i][j] = i+j;
    //         else if(word1.charAt(i-1)==word2.charAt(j-1))
    //          dp[i][j] = dp[i-1][j-1];
    //         else
    //          dp[i][j] = 1 + Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
    //     }
    //   } 
    //   return dp[n][m]; 
    // }

    //Approach2-Memorization
    int[][] dp = new int[501][501];
    public int minDistance(String word1, String word2)
    {
        for(int[] row : dp)
         Arrays.fill(row,-1);
       return solve(word1,word2,0,0);
       
    }
    public int solve(String s1,String s2,int i , int j)
    {
        if(i==s1.length())
         return s2.length()-j;
         if(j==s2.length())
         return s1.length()-i;
        if(dp[i][j]!=-1)
         return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
         return dp[i][j] = solve(s1,s2,i+1,j+1);
        else
        {
            int replace = 1 + solve(s1,s2,i+1,j+1);
            int delete = 1 + solve(s1,s2,i+1,j);
            int insert = 1 + solve(s1,s2,i,j+1);

        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
        }
    }
}
