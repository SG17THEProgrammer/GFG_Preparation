package Array;

import java.util.Stack;

public class Next_Smaller_Element {
    public static void main(String[] args) {
        // int arr[] = {1 ,3 ,2 ,4};
        // int arr[] ={10, 20, 30, 50};
        int arr[] ={2,1,4,3};
        int n = arr.length;

         Stack<Integer> st = new Stack<Integer>();
         st.push(-1); // as last element ka smallest hamesha -1 hoga 
        long ans[] = new long [n];

        for (int i = n-1; i >=0; i--) {
            int curr = arr[i];
            while (!st.isEmpty() && st.peek()>=curr) {//jabtak top bda hai curr se tabtak pop krte rho
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }

    }
}
