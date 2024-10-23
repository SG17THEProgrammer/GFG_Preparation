package Array;

class Compute_sum_of_digits_in_all_numbers_from_1_to_n {

    public static int sumOfDigit(int x){
        int sum=0;
        while(x!=0){
            sum += x%10;
            x=x/10;
        }
        return sum ;
    }
    
    public static void main(String[] args) {
        // int N = 5;
        int N = 12;
        int res = 0;
        for(int i=1;i<=N;i++){
            res+=sumOfDigit(i);
        }
        
        System.out.println( res);
    
    }
    
}