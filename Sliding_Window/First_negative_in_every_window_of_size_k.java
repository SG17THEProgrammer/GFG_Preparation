//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
package Sliding_Window;

import java.util.*;

public class First_negative_in_every_window_of_size_k {
    public static void printFirstNegativeInteger(long A[], int N, int K, Deque<Long> deq, ArrayList<Long> res) {

        int i = 0, j = 0;
        while (j < N) { // j last tk
            if (A[j] < 0)
                deq.addLast(A[j]); // -ve aa gya toh deque mein daal denge

            if (j - i + 1 == K) {// window is full
                if (!deq.isEmpty()) {// negative elements honge isme if it's not empty
                    res.add(deq.getFirst()); // first negative ko res mein add kr denge
                } else {
                    res.add((long) 0); // else 0 mtlb nrgative nhi mila
                }

                if (A[i] < 0 && !deq.isEmpty())
                    deq.pollFirst();// i bhadane se pahale will see agar index i pe negative hai aur deque khaali
                                    // nhi hai toh first elem uda denge

                i++;

            }

            j++;
        }

        long ans[] = new long[res.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = res.get(k);
        }

        for (int k = 0; k < ans.length; k++) {
            System.out.print(ans[k] + " ");
        }

    }

    public static void main(String[] args) {
        Deque<Long> deq = new ArrayDeque<>();
        ArrayList<Long> res = new ArrayList<>();
        int N = 5;
        long A[] = { -8, 2, 3, -6, 10 };
        int K = 2;
        printFirstNegativeInteger(A, N, K, deq, res);
    }
}