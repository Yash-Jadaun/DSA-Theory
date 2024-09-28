public class searchinsertposition {
   
   static int searchInsertPosition(int []nums,int target){
    int start=0;
    int end=nums.length-1;

    while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
    
    }
    return start;

   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        int target=5;
        System.out.println(searchInsertPosition(nums, target));

        int [] nums2={1,3,5,6};
        int target2=2;
        System.out.println(searchInsertPosition(nums, target2));

        int [] nums3={1,3,5,6};
        int target3=7;
        System.out.println(searchInsertPosition(nums, target3));


    }
}
