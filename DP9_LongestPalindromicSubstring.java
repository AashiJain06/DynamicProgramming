// public String longestPalindrome(String s) {
//Approach - 1 Using Memorization and cumputing all substrings
    //     int n = s.length();
    //     int max_length =0;
    //     int sp =0;
    //    int dp[][] = new int[n][n];
    //    for(int[] row : dp)
    //    {
    //      Arrays.fill(row,-1);
    //    }
    //     for(int i =0;i<n;i++)
    //     {
    //         for(int j =i;j<n;j++)
    //         {
    //             if(check(s,i,j,dp))
    //             {
    //                 if((j-i+1)>max_length)
    //                 {
    //                     max_length = j-i+1;
    //                     sp = i;
    //                 }
    //             }
    //         }
    //     }
    //     return s.substring(sp,sp+max_length);
    // }
    // public boolean check(String s , int i , int j,int[][] dp)
    // {
        
    //     if(i>=j)
    //      {
    //         dp[i][j] = 1;
    //         return true;
    //      }
    //      if(dp[i][j]!=-1)
    //      {
    //         if(dp[i][j]==1)
    //          return true;
    //         else
    //          return false;
    //      }
    //     if(s.charAt(i)==s.charAt(j))
    //      return check(s,i+1,j-1,dp);
    //      else
    //      {
    //         dp[i][j] = 0;
    //         return false;
    //      }

    // }
//Bottom Up Approach
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int sp =0;
        int max_length = 0;
        for(int l=1;l<=n;l++)
        {
            for(int i =0;i+l-1<n;i++)
            {
                int j = i+l-1;
                if(i==j)
                 dp[i][j] = true;
                else if(i+1==j)
                 dp[i][j] = s.charAt(i)==s.charAt(j);
                else
                 dp[i][j] = ((s.charAt(i)==s.charAt(j) && dp[i+1][j-1]));

                 if(dp[i][j])
                 {
                    max_length = l;
                    sp = i;
                 }
            }
        }
        return s.substring(sp,sp+max_length);
    }
