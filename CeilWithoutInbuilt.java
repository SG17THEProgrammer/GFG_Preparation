public class CeilWithoutInbuilt {
    public static int intCeil(int a, int b) {
        if (a % b != 0) {
          return (a / b) + 1;
        } else {
          return (a / b);
        }
      }
  
    public static void main(String[] args) {
        System.out.println(intCeil(10,3));
    }
}
