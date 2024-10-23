package DP;
// https://practice.geeksforgeeks.org/contest/accenture-mock-14-shift-i-gla-x-gfg/problems
public class Rod_Cutting {
  
    public static int cutRod(int price[], int n) {
        //code here
        int dp[] = new int[n+1];
        //if n ke liye nikal rhe toh loop 0 to n-1 chalega
        for (int i = 1; i <= n; i++) {
            dp[0] =0 ; 
            // Trying all possible lengths to cut the rod
            for (int j = 0; j < i; j++) {
              dp[i]  = Math.max(dp[i], price[j] + dp[i-j-1]);
            }
            
        }
        return dp[n]; 
    }
    public static void main(String[] args) {
        int n = 8;
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price,n));
    }
}
