import java.util.Arrays;
public class merge {
    public void merge(int [] nums1,int m,int [] nums2,int n){
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }

        sort(nums1,m+n);
    }

    public void sort(int[] nums1,int length){
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1;j++){
                if(nums1[j]>nums1[j+1]){
                  swap(nums1,j,j+1);  
                }
            }
        }
    }

    public void swap(int[] nums1,int i,int j){
        int temp=nums1[i];
        nums1[i]=nums1[j];
        nums1[j]=temp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};

        merge m=new merge();
        m.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }
}
