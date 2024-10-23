// https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-139/problems

import java.util.HashMap;

public class Max_Batallion {
    public static int maximumBattalions(int N, String[] names) {
        // code here
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = N - 1; i >= 0; i--) // right to left iteration
        {
            if (map.containsKey(names[i]) == false) // map mein name daal rha with their indexes (last occurence)
            {
                map.put(names[i], i);
            }

        }
        int ans = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            // idx = map.get(names[i]): This gets the last occurrence of the current name.

            // max keeps track of the farthest last occurrence of names seen so far.

            // If the current index i matches max, this means we have reached the end of a
            // segment where all names between the start of this segment and i have their
            // last occurrences within this range. At this point, we increment the ans
            // counter (number of segments).

            int idx = map.get(names[i]);
            if (idx > max)
                max = idx;
            if (i == max) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // String[] names ={"abc", "def", "abc", "aieh"};
        String[] names ={"qw", "iwero", "adf", "bk", "qw"};
        System.out.println(maximumBattalions(5, names));
    }
}
