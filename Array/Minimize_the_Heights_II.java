package Array;
import java.util.*;
public class Minimize_the_Heights_II {
    public static void main(String[] args) {
        // int arr []= {1, 5, 8, 10};
        // int k = 2;


        int arr []= {3, 9, 12, 16, 20};  
        int k = 3;
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        
        int min=0,max=0;
        
        for(int i=0;i<n-1;i++){
            min = Math.min(smallest,arr[i+1]-k);
            max = Math.max(largest,arr[i]+k);
            
            if(min<0) continue;
            
            ans = Math.min(ans,max-min);
        }
        
        System.out.println( ans);
    }
}
