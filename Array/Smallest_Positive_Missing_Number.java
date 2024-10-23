package Array;
import java.util.Arrays;

public class Smallest_Positive_Missing_Number {
    public static void main(String[] args) {
        // int arr [] = {1,2,3,4,5};
        int arr[] = { 0, -10, 1, 3, -20 };

        int size = arr.length;

        // Approach 1

    //     Arrays.sort(arr);
    //     int counter=1;
    //     for(int i=0;i<size;i++){
    //     if(arr[i]==counter) counter++;
    //     }
    //    System.out.println(counter);



        
        // Approach 2

        // ans will come in range (1 ,n+1)
        // O(n)
        // boolean flag[] = new boolean[size + 2];
        // for (int i = 0; i < size; i++) {
        //     if (arr[i] <= 0 || arr[i] >= size + 1) // negative aur 0 kisi kaam ke nhi hai
        //         // also ans range ke bhar ho gya arr[i] toh bhi koi kaam ka nhi hai
        //         continue;
        //     else
        //         flag[arr[i]] = true;
        // }
        // for (int i = 1; i < flag.length; i++) {
        //     if (flag[i] == false) {
        //         System.out.println(i);
        //         break;
        //     }
        // }


        


        // Approach 3 -- TC (O(n))
        for (int i = 0; i <size; i++) {
            if(arr[i]<= 0 ) arr[i]=size+2;
        }

        for (int i = 0; i < size; i++) {
            int elem = Math.abs(arr[i]);
            int idx = elem-1;
            if(idx>=size){
                continue;
            }
            else{
                arr[idx] *= (-1);
            }
        }

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
                System.out.println(i+1);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(size + 1);
        }

    }
}
