import java.util.Scanner;
public class switchp {
    public static void main(String[] args) {
        System.out.println("enter day");
        Scanner s=new Scanner(System.in);
        int day=s.nextInt();
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
        }
    }
}
