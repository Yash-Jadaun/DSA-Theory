public class evenOdd {
   
   public static boolean isOdd(int n){
        return (n & 1)==1;
   }
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int n = 66;
        System.out.println(isOdd(n));
    }
}
