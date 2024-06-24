import java.io.*;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        String fruit = s.next();

       String a = "yash";
       String b = "yash";

       System.out.println(a==b);

   
     .equals only check value not reference



     switch (fruit){
        case "Mango":
             System.out.println("King of fruits");
             break;

        case "Apple":
        System.out.println("A sweet red fruit");
        break;
        
        case "Orange":
        System.out.println("Round fruit");
        break;

        case "Grapes":
        System.out.println("Small fruit");
        break;

        default:
        System.out.println("Plz enter a valid fruit");
    
    }





        System.out.println("Enter a day");
        int  day = s.nextInt();
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
           
        // }



      


}
}
