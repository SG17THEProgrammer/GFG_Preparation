public class Binary_Modulo {

    public static int modulo(String s, int m) {

        // way 1

        // due to constraint we cannot convert the whole binary string to integer
        // so we will check one by one character
        // int result = 0;
        // for (char c : s.toCharArray()) {
        // //left shift 1 //add curr bit
        // //in dec it's *2
        // result = (result * 2 + (c - '0')) % m;
        // //kept it within bounds
        // }

        // return result;

        // way 2
        int base = 1;
        int dec_value = 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                dec_value += base;

            dec_value %= m; // bound me rhe
            base = base * 2; // 0 2 4 8 ....
            base %= m;// bound me rhe

        }
        return dec_value % m;
    }

    public static void main(String[] args) {
        // String s = "1000";
        // int m = 4;
        String s = "101";
        int m = 2;
        System.out.println(modulo(s, m));
    }
}
