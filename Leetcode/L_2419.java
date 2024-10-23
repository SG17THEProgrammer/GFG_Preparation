public class L_2419{

    public static void main(String[] args) {
        // int []arr = {1,2,3,3,2,2};
        // int []arr = {1,2,3,4};  
        int []arr = {5,5,5,1,5};  
        int res=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                 res = Math.max(res,arr[i] & arr[j]);
            }
        }
        System.out.println(res);
    }
}