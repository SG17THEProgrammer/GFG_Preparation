package Array;

class Smallest_window_containing_0_1_and_2{

    public static void main(String[] args) {
        // String S = "10212";
        String S = "12121";
         int n = S.length();
        int zeroes = 0 ,ones=0,twos=0;
        int l=0,r=0;
        int ans=-1;
    
        for(r=0;r<n;r++){
            if(S.charAt(r)=='0') zeroes++;
            else if (S.charAt(r)=='1') ones++;
            else twos++;
            
            //jabtak one nhi ho jaate teeno tab tk ans nhi nikalenge
        while(ones>=1 && twos>=1 && zeroes>=1){//all three are present 
            if(ans==-1) ans=r-l+1; //starting mein jo substring mili 
            else ans = Math.min(ans,r-l+1) ;
            
        //as l is going aage toh l pe jo hai uska count kum hota rahega 
        if(S.charAt(l)=='0') zeroes--;
        else if (S.charAt(l)=='1') ones--;
        else twos--;
        
        l++;
        }
        
        }
        
        System.out.println(ans);
        
    }
}