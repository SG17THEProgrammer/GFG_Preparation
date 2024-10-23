package Array;

public class Max_And_Min {
    public static void main(String[] args) {
        int arr[] = {8,4,5,0,3};
        int left =0;
        int right =arr.length-1;

        int max=arr[0];
        int min=arr[0];

        while(left<=right){

            if(arr[left] >= max){
                max=arr[left];
            }else if (arr[left] <= min){
                min=arr[left];
            }

            if(arr[right] >= max){
                max=arr[right];
            }else if (arr[right] <= min){
                min=arr[right];
            }
           
            left++;
            right--;

        }

        System.out.println(max);
        System.out.println(min);
    }
}
