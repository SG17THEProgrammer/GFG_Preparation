package Stack;

import java.util.*;

class Histogram_Max_Rectangular_Area {
    
    public static long[] nextSmallerElem(long arr[], int n) {
        Stack<Integer> st = new Stack<>();
        long ans[] = new long[n];
        st.push(-1); // Sentinel value

        for (int i = n - 1; i >= 0; i--) {
            long curr = arr[i];
            while (!st.isEmpty() && st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    
    // Function to find the previous smaller element for each element in the array.
    public static long[] prevSmallerElem(long arr[], int n) {
        Stack<Integer> st = new Stack<>();
        long ans[] = new long[n];
        st.push(-1); // Sentinel value

        for (int i = 0; i < n; i++) {
            long curr = arr[i];
            while (!st.isEmpty() && st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        long hist[] = {6, 2, 5, 4, 5, 1, 6};
        int n = hist.length;
        
        long next[] = nextSmallerElem(hist, n);
        long prev[] = prevSmallerElem(hist, n);
        long area = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            long height = hist[i];
            long width = (next[i] == -1 ? n : next[i]) - prev[i] - 1;
            long newArea = height * width;
            area = Math.max(area, newArea);
        }
        
        System.out.println("Maximum rectangular area in histogram is: " + area);
    }
}
