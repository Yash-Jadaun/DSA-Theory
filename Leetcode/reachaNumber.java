public class reachaNumber {
    
    public static int reachnum(int [] arr, int target){
          int start = 0;
          int end = 1000000000;
          
          while(start<end){
            int mid = start + (end - start)/2;

            if(mid == target){
                return mid;
            }

            else if(mid < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
          }
          return start;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int [] arr = {0,1,2,3};
        int target = 4;
        System.out.println(reachnum(arr, target));
    }
}
