package Array;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[] = {1 ,3 ,2 ,4};
        // int arr[] ={10, 20, 30, 50};
        int n = arr.length;
        //TLE
        
        // long res[] = new long [n];
        // Arrays.fill(res,-1);
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++ ){
        //         if(arr[i]<arr[j]) {
        //             res[i]=arr[j]; 
        //             break;
                    
        //         }
        //     }
        // }
        
        
        // return res;
            
            
            
        //Stack approach 
        //will be storing indexes
        Stack<Integer> st = new Stack<Integer>();
        long ans[] = new long [n];

        for(int i=0;i<n;i++){
            //find out for how many elem arr[i] can be its next greater elem
            while(!st.empty() && arr[st.peek()]<arr[i]) ans[st.pop()] = arr[i];
            st.push(i);
        }
        
        //for remaining we have -1 as ans
        while(!st.empty()){
            ans[st.pop()]=-1;
        }
        
        for (int i = 0; i < ans.length; i++) {
            
            System.out.print(ans[i]+" ");
        }
    }
}
