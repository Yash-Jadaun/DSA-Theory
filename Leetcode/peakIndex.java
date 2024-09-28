public class peakIndex {
    static int peakIndex(int [] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid>0 && mid<arr.length-1){
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }return -1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int [] arr={0,1,0};
        System.out.println(peakIndex(arr));

        int [] arr1={0,2,1,0};
        System.out.println(peakIndex(arr1));

        int [] arr2={0,10,5,2};
        System.out.println(peakIndex(arr2));

        int[] arr3 ={24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndex(arr3));

    }
}
