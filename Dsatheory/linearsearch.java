public class linearsearch {
    
   //search in the array:return the index if item found
   //otherwiseif item not found return -1

//    static int linearSearch(int[] arr,int target){
//       if(arr.length==0){
//         return -1;
//       }

//       for(int i=0;i<arr.length;i++){
//         int element=arr[i];
//         if(element==target){
//             return i;
//         }
//       }return -1;
//     }




       static boolean linearSearch(int[] arr,int target){
        boolean a=false;
       if(arr.length==0){
        return false;
       }
       for(int element:arr){
        if(element==target){
            return true ;
        }
       }return false;

       }



   
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       int[] arr={1,2,3,4};
       int target=2 ;
       boolean ans=linearSearch(arr, target);
       System.out.println(ans);
    }
}
