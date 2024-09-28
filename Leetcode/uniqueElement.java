public class uniqueElement {
    
    public static void uniqueElement(int [] arr){
       
        int xorResult = 0;

        for(int num : arr){
           xorResult ^= num;
        }

        System.out.println("XOR of all elements in the array" + xorResult);
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int []arr = {2,2,3,3,5,6,7,6,7};
         uniqueElement(arr);
   

    }
}
