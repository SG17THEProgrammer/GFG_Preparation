import java.util.Stack;

public class Lexicographically_smallest_string{
        //length power of 2 hone ke liye no of setbits 1 honi chahiye 
        //otherwise length power of 2 nhi hogi
        
        public static int countSetBits(int num){
            int cnt=0;
            while(num>0){
                cnt = cnt+(num&1);
                num>>=1;
            }
            return cnt;
        }
    public static void main(String[] args) {

        String S = "fooland";
        int k = 2;
        // String S = "code";
        // int k = 4;
         int n = S.length();
        if(countSetBits(n)==1) k/=2;
        else k*=2;
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.empty() && k>0 && st.peek()>S.charAt(i)){
                st.pop();//remove krenge char 
                k--;
            }
            st.push(S.charAt(i));
        }
        while(!st.empty() && k>0){ //increasing aa gya lekin still k>0 toh aur last se pop krte jaao
            st.pop();//remove krenge char 
            k--; 
        }
            
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }
        
        ans.reverse();
        
        String res = ans.toString();
        if (res.length() == 0) {
            System.out.println("-1");
        }
        System.out.println(res);
        
    }
}