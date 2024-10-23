public class Consecutive_1s_not_allowed {
    private static final int MOD = 1000000007;

    //approach 1 using dp 

    // public static long countStringsDP(int n) {
    //     if (n == 1) return 2; // "0", "1"
    //     if (n == 2) return 3; // "00", "01", "10"

    //     int [] dp = new int [n + 1];
    //     dp[1] = 2; // "0", "1"
    //     dp[2] = 3; // "00", "01", "10"

    //     for (int  i = 3; i <= n; i++) {
    //         dp[ i] = (dp[ i - 1] + dp[ i - 2]) % MOD;
    //     }

    //     return  (long) dp[ n];
    // }






    //approach 2 
    public static long countStrings(int n) {
        // code here
        if(n==1) return 2;
       int zeroEndingStr = 1 ; //'0'
       int oneEndingStr = 1;//'1'
       int res = zeroEndingStr+oneEndingStr;
       
       int i =2  ;
       while(i<=n){
           //1 . will take one ending strings 
           oneEndingStr=zeroEndingStr%MOD;
           //2 . will take zero ending strings 
           zeroEndingStr=res%MOD;
           //3.store in res sum of both 
           res = zeroEndingStr+oneEndingStr%MOD;
           
           i++;
       }
       return (long)res%MOD;
    }


    
    public static void main(String[] args) {
        int n =3;
        // int n=2 ;
        // System.out.println(countStringsDP(n));
        System.out.println(countStrings(n));
    }
}
