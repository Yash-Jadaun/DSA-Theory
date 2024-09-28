import java.util.*;
import java.util.HashSet;
public class Intersection {
    static void intersection(int [] nums1, int [] nums2){
        HashSet<Integer> set1 = new HashSet<>();
       
        for(int num : nums1){
            set1.add(num);
         }

        HashSet<Integer> intersection = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                intersection.add(num);
               }
            }

        int [] arr = new int[intersection.size()];
        for(int i=0;i<intersection.size();i++){
            arr[i]=intersection.get();

        }
        return arr;

        }
         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
}
