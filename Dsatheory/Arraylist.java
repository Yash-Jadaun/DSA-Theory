import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
     
      Scanner s =new Scanner(System.in);

    //   ArrayList<Integer> list=new ArrayList<>();  
    //    list.add(2);
    //    list.add(3);
    //    list.add(4);
    //    list.add(5);
    //    list.add(6);


    //   System.out.println(list);
    // }}
    //    list.set(0, 99);
       
    //    System.out.println(list);


//        for(int i=0;i<5;i++){
//           list.add(s.nextInt());
//        }

//        for(int i=0;i<5;i++){
//         System.out.println(list.get(i));
//        }
           
//         System.out.println();

//     }
// }




ArrayList<ArrayList<Integer>> list= new ArrayList<>();
for(int i=0;i<3;i++){
    list.add(new ArrayList<>());

}

for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        list.get(i).add(s.nextInt());
    }
}
System.out.println(list);
}
}
