public class searchinrange {
    
    static int linearSearch(int[] arr,int target,int start,int end){
    if(arr.length==0){
    return -1;
    }

    for(int i=start;i<=end;i++){
        int element=arr[i];
        if(element==target){
            return i;
        }
    }return -1;




    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(linearSearch(arr, 3, 1, 3));
    }
}
