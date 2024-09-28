public class binarysearch {
   
   static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length;
        while(start<=end){
            // int mid = (start+end)/2;//this may exceed th int range of java

            int mid = start + (end - start)/2;

            if (target < arr[mid]){ //move left
                end = mid - 1;

            }else if(target > arr[mid]){
                start = mid + 1;

            }else{
                return mid;
            }

        }
        return -1;
   }
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        //find the middle element
        int [] arr = {1,2,3,4,5,6,7};
        int target = 6;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
}
