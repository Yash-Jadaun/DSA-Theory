import java.util.Scanner;
public class turnIt {
    public static int turn(int num,int i){
        int bitmask = 1 << i;

        return num | bitmask;
            
       } 
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Input the bit position (i)
        System.out.print("Enter the bit position to set to 1 (0-indexed): ");
        int i = scanner.nextInt();

        // Convert the ith bit to 1
        int newNum = turn(num, i);

        // Output the result
        System.out.println("The number after setting the " + i + "th bit to 1 is: " + newNum);

        scanner.close();
    }
}
