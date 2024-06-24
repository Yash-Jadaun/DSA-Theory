import java.util.Arrays;
public class varargs {
    public static void main(String[] args) {
        // fun("Yash","1","Prashant","Shivam","Kashyap","2");
        // fun();

        multiple(2, 3, "Yash Jadaun");
        
       
    }




     static void multiple(int a,int b,String ...v){
        System.out.print(a + " ");
        System.out.print(b);
        System.out.print(Arrays.toString(v));
      
      
     
     }



    
    
    
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
