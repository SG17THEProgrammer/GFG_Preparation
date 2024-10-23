package Sliding_Window;
//https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
public class Count_Occurences_of_Anagrams {
    public static boolean allZeros(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false; 
        }
        
        return true ; 
    }

    public static int search(String pat, String txt) {
        // code here
        //saare lowercase english letter hai toh it's better we go 
        // for array
        int n = pat.length();
        int k = txt.length();
        int arr[] = new int [26] ; 
        //need to increase freq of character in arr 
        for(int i=0;i<n;i++){
            arr[pat.charAt(i)-'a']++;
        }
        
        int i=0,j=0,cnt=0;
        while(j<k){//j last tk jaayega 
        
        //jahan j jaayega wahan uss charcter ki freq kum krni hai as wo window mein aa gya hai
        arr[txt.charAt(j) -'a']--;
        
        //check ki window ban gyi ki nhi 
        if(j-i+1 == n){
            //agar array mein sab zero ho gye toh cnt++ hoga 
            if(allZeros(arr)) cnt++ ; 
            
        //ab i ko bhadana hoga lekin usse pahale need toh increase the freq of ith character 
        arr[txt.charAt(i)-'a']++;
        i++;
        }
        
        j++;//it will keep on increasing
        }
        
        return cnt ; 
    }
    public static void main(String[] args) {

        // String txt = "forxxorfxdofr";
        // String pat = "for";
        String txt = "aabaabaa";
        String pat = "aaba";
        System.out.println(search(pat,txt));
    }
}
