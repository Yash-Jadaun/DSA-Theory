public class dll {
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        Node next;
        Node prev;
        int val;

       public Node(int val){
        this.val = val;
       }
       
       
       
       
       
       
       
        public Node(int val,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }

     
    public void insertFirst(int val){
        Node node = new Node(val);
        if(tail == null){
            tail = head;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;

    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "<=====>");
            temp = temp.next;

        }
        System.out.println("END");
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        dll list = new dll();
        list.insertFirst(1);
        list.insertFirst(2); 
        list.insertFirst(3); 
        list.insertFirst(4);
        list.display();        
    }
}
