public class findPositive {
   public static int positive(int [] arr){
    int singlePositive = 0;
      
    for (int n : arr) {
       if (n > 0) { // Consider only positive numbers
          singlePositive ^= n;
       }
    }
    
    return singlePositive;
 }    
    
    
    
    
    public static void main(String[] args) {
       int [] arr = {-2,2,-3,3,5};
       int result = positive(arr);  
       System.out.println(result);  
     
    }
}
