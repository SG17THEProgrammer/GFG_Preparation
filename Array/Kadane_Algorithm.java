package Array;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, -2, 5};
        // int arr[] = {-1, -2, -3, -4};
        int arr[] = {5, 4, 7};

        int n = arr.length;

        long prev_sum =  arr[0];
        long ans =prev_sum;
        
        for(int i=1;i<n;i++){
            prev_sum= Math.max(prev_sum+arr[i] , arr[i]); 
            ans = Math.max(prev_sum ,ans); 
        }
        
        System.out.println(ans);
    }
}
