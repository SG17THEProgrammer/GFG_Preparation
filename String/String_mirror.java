// https://practice.geeksforgeeks.org/contest/accenture-mock-14-shift-i-gla-x-gfg/problems
public class String_mirror {
    public static String stringMirror(String str) {
        // code here
        String ans = str.charAt(0)+"" ; 
        for(int i=1;i<str.length();i++){
                                                     //check for if character is same    
            if((str.charAt(i) <str.charAt(i-1)) || (i>1 && str.charAt(i)==str.charAt(i-1))){
                ans+=str.charAt(i);//if above condition is true tabhi append krenge char in string
            }
            else break;
        }
        
        return ans + (new StringBuilder(ans).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(stringMirror("bvdfndkn"));
        System.out.println(stringMirror("casd"));
    }
}
