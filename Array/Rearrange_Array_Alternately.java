package Array;

public class Rearrange_Array_Alternately {
    public static void main(String[] args) {

        // int arr[] = {1,2,3,4,5,6};
        long arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
        int n = arr.length;

        // Note 👍
        // if x=a+pb is as equation where p is max+1
        // so x%p = a
        // x/p=b

        // basically hrr element ko hum a+pb ke form mein store karenge in the array so
        // that we do not loose a and b


        long maxElement = arr[n - 1] + 1;
        int mn = 0, mx = n - 1, k = 0;
        while (mn <= mx) {
            long a = arr[k]; // current element
            if (k % 2 == 0) { // even indexes pr maxElement chhaiye 
                long b = arr[mx] % maxElement; // b nikal diya
                mx--;
                arr[k] = a + b * maxElement;
                // p*b + a
                k++;
            } else { // odd indexes pr min element  chahiye
                long b = arr[mn] % maxElement;
                mn++;
                arr[k] = a + b * maxElement;
                   // a + b*p
                k++;
            }

        }
        for (k = 0; k < n; k++) {
            arr[k] /= (maxElement);
            System.out.print(arr[k] + " ");
        }
    }
}
