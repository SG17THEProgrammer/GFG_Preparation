public class Power {
//1L to ensure that the multiplication happens in 64 bits, preventing overflow.

    static final int MOD = 1000000007;

    public static int solve(int n, int p) {
        if (p == 0) return 1;  // Base case: n^0 = 1
        
        n = n % MOD;  // Apply modulo to n initially
        
        if (p % 2 == 0) {  // If power is even, (n^(p/2))^2
            int halfPower = solve(n, p / 2);
            return (int)((1L * halfPower * halfPower) % MOD);  // Cast to long before multiplication to prevent overflow
        } else {  // If p is odd
            return (int)((1L * n * solve(n, p - 1)) % MOD);  // Cast to long before multiplication
        }
    }

    public static void main(String[] args) {
        int n = 12;
        int p = 21;

        System.out.println(solve(n, p)); 
    }
}
