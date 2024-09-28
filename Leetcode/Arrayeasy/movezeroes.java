package Arrayeasy;
import java.util.Arrays;
public class movezeroes {
   static int[] movezeroes(int [] nums){
    int n=nums.length;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            for(int j=i+1;j<n;j++){
                if(nums[j]!=0){
                    swap(nums,i,j);
                    break;
                }
            }
        }
     }
      return nums;


   }
   
   static void swap(int [] nums,int first,int second){
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
   }
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int [] nums={0,1,0,3,12};
        System.out.println(Arrays.toString(movezeroes(nums)));
    }
}
