public class UniqueCharInString{

    public static String findUnique(String s ,int arr[]){
        for(char ch : s.toCharArray()){
            arr[ch-'a']++; //imp things 
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                sb.append((char) ('a' + i)) ; //imp things 
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s =  "pabcccsaappcdoollk";
        int arr[] = new int [26] ; 
        System.out.println(findUnique(s,arr));
    }
}