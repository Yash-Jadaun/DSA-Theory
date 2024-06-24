import java.util.Scanner;
public class BT2 {
     private Node root;

     private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.left = left;
            this.right = right;
        }
     }


     public void populate(Scanner scanner){
        System.out.println("Enter the value of root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
     }
    
    
    
      public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to add left of" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left Node" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }


        System.out.println("Do you want to add right of" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of left Node" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }


      public void display(){
        display(root, "");
      }

       private void display(Node node ,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
       }
         






      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BT b= new BT();
        b.populate(scanner);
        b.display();


    }
}
