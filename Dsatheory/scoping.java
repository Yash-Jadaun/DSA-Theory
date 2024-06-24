public class scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(marks);
        String name = "Yash";

        {
            a = 78;//already initialized outside the block in the same method,hence you cannot initialised again 
            a = 100; // readdign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "kunal";
            System.out.println(name);
            //values initialised in this block, will remain in this block
        }

        System.out.println(name);
  
        //scoping in for loop 
        for(int i=0;i<4;i++){
            System.out.println(i);
        }
    }






    static void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);
    }
}
