import java.util.*;

public class Make_Palindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean makePalindrome(int n, String[] arr) {
        // code here

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> temp = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {// traversing the map
            String curr = e.getKey();
            int freq = e.getValue();

            // 1 . if palind ; put it in another map and check freq not to be odd
            if (isPalindrome(curr)) {
                temp.put(curr, freq);
                continue;
            }

            // 2. if not palind ; check if its reversal is present with same feq
            StringBuilder sb = new StringBuilder(curr);
            sb.reverse();
            int y = map.get(sb.toString()) == null ? 0 : map.get(sb.toString());

            // checking if reverse is present || reverse is present with diff freq
            if (y == 0 || freq != y)
                return false;

        }

        int cnt = 0;
        for (int i : temp.values()) {
            if (i % 2 == 1)
                cnt++;
        }
        if (cnt > 1)
            return false;
        return true;

    }

    public static void main(String[] args) {
        // String[] arr = {"djfh", "gadt", "hfjd", "tdag"};
        String[] arr = { "jhjdf", "sftas", "fgsdf" };
        int n = arr.length;
        System.out.println(makePalindrome(n, arr));
    }
}
