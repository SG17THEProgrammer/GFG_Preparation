//https://www.geeksforgeeks.org/problems/search-pattern-rabin-karp-algorithm--141631/1
import java.util.*;
public class KMP{
    public static int[] computeLPS(String pattern , int m ) {
        
        //lps[j] -- ka mtlb hai  (0 to j) mein equal length of longest suffix and prefix
        
        int len = 0; // Length of the previous longest prefix suffix
        int[] lps = new int[m];

        lps[0] = 0; // Because there is no proper suffix and prefix of pattern[0..0]

        int i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; //You can also write, len = len-1;
                } else {
                    lps[i] = 0;//nhi hai iska koi lps
                    i++;
                }
            }
        }

        return lps;
    }

    public static ArrayList<Integer> search(String pat, String txt){
  
         ArrayList<Integer> res = new ArrayList<>(); // ans isme store hoga 
        int n = txt.length();
        int m = pat.length();
        
          int[] lps = computeLPS(pat , m); //longest prefix suffix 
          
            int i = 0; // Index for text
            int j = 0; // Index for pattern
            
            while(i<n){
                if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            
              if (j == m) {
                res.add(i - j + 1); // Pattern found at index i - j + 1 (1-based indexing)
                j = lps[j - 1]; // j ko piche krenge as abhi yeh out of bound ho gya
            } else if (pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];//j ko piche bhejenge
                } else {
                    i++; //mila hi nhi piche koi same 
                }
            }

            }
    
                return res;
}

public static void main(String[] args) {
    String  text = "birthdayboy";
String  pattern = "birth";

// String  text = "geeksforgeeks";
// String  pattern = "geek";
   System.out.println(search(pattern , text  ));
}
    
}