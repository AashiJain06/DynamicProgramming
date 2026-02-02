class Solution {
    //     public int lengthOfLIS(int[] nums) {
    //         int n = nums.length;
    //         int[][] dp = new int[2501][2501];
    //        for(int[] t : dp)
    //        {
    //         Arrays.fill(t,-1);
    //        }
    //         return solve(nums,0,-1,dp);
    //     }
    //     public int solve(int[] nums, int i,int p,int[][] dp)
    //     {
    //         if(i>=nums.length)
    //          return 0;
    //          if(p!=-1 && dp[i][p]!=-1)
    //           return dp[i][p];
    //          int take =0;
    //         if(p==-1 || nums[i]>nums[p])
    //           take = 1+ solve(nums,i+1,i,dp);

    //         int skip = solve(nums,i+1,p,dp);
    //         if(p!=-1)
    //          dp[i][p] = Math.max(take,skip);

    //     return Math.max(take,skip);
    //     }
public int lengthOfLIS(int[] nums) {
      int[] dp = new int[nums.length];
      int max_length = 0;
      Arrays.fill(dp,1);
      int j =0;
      for(int i =0;i<nums.length;i++)
      {
        j =0;
         while(j<i)
         {
            if(nums[j]<nums[i])
            {
                dp[i] = Math.max(dp[i],dp[j]+1);
            }
            j++;
         }
         max_length = Math.max(dp[i],max_length);
      }
      return max_length;
    }
}
