import java.io.*;
import java.util.Scanner;
public class Nestedswitch {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int empid = s.nextInt();
   
    String department = s.next();

    switch(empid){
        case 1:
        System.out.println("Kunal Kush");
        break;

        case 2:
        System.out.println("Rahul Rana");
        break;

        case 3:
        switch(department){
            case "IT":
            System.out.println("IT Department");
            break;

            case "Management":
            System.out.println("Management Department");
            break;

            default:
            System.out.println("No department Empid");
            break;
        }

    }





    }


}
