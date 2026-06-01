
class Solution {
    int[] dp ;
    public int maxValue(int[] arr) {
      int  n = arr.length;
      if(n==1)
       return arr[0];
      if(n==2)
       return Math.max(arr[0],arr[1]);
      int case1 = solve(arr,0,n-2);
      int case2 = solve(arr,1,n-1);
      
      return Math.max(case1,case2);
}

public int solve(int[] arr  ,int start , int end)
{
    int prev1 =0;
    int prev2 =0;
    for(int i =start;i<=end;i++)
    {
        int steal = arr[i] + prev2;
        int skip = prev1;
        
        int curr = Math.max(steal , skip);
        prev2  = prev1;
        prev1 = curr;
    }
    return prev1;
}
}
