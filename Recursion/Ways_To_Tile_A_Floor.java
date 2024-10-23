public class Ways_To_Tile_A_Floor {
    public static final int MOD = 1000000007;
    public static int numberOfWays(int n) {
        // code here
          if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1; // 1 way to tile a 2 x 1 floor
        dp[2] = 2; // 2 ways to tile a 2 x 2 floor

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[n];
        }
    public static void main(String[] args) {
        // int n= 3;
        int n= 4;
        System.out.println(numberOfWays(n));
    }
}
