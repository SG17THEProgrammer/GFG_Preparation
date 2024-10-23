//https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
class TowerOfHanoi {

    public static long toh(int n, int from, int to, int aux) {
        // Your code here
        if(n==0) return 0;
        if(n==1) {
    System.out.println("move disk " + n + " from rod " +from + " to rod " +to);
            return 1;
            
        }
        
        long cnt =0 ; 
        //step 1 
        // n-1 disk ko "from" rod  se "aux" rod pe laao with help of "to" rod
        cnt = toh(n-1 , from , aux , to );
        //step2 
        //nth disk ko from se to laao
        System.out.println("move disk " + n + " from rod " +from + " to rod " +to);
        cnt++;
        
        //step3 
        //n-1 disk ko "aux" rod se "to" rod pe laao with help of "from"
        
        cnt+=toh(n-1 , aux , to , from);
        
        return cnt ; 
    }
    public static void main(String[] args) {
        // int n=2;
        int n=3;
        System.out.println(toh(n, 1, 3, 2));
    }
}
