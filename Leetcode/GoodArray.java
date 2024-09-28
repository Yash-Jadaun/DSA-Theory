public class GoodArray {
   public boolean isGoodArray(int [] nums){
    int gcd = nums[0];

    for(int i=1;i<nums.length;i++){
        gcd = gcd(gcd,nums[i]);

        if(gcd == 1){
            return true;
        }
    }

    return gcd == 1;
   }
   
   private int gcd(int a,int b){
    if(b==0){
        return a;
    }
    return gcd(a, b);
   }
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        GoodArray ga = new GoodArray();
        
        // Test case 1
        int[] nums1 = {12, 5, 7, 23};
        System.out.println(ga.isGoodArray(nums1)); // Output: true

        // Test case 2
        int[] nums2 = {29, 6, 10};
        System.out.println(ga.isGoodArray(nums2)); // Output: true

        // Test case 3
        int[] nums3 = {3, 6};
        System.out.println(ga.isGoodArray(nums3)); // Output: false
   } 
}
