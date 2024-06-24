import java.util.LinkedList;

public class Singlyll {
    private Node head;
    private Node tail;
    private int size;
  
    public Singlyll(){
        this.size = 0;
        this.head = null;
        this.tail = null;   
    }



    private class Node{
        int val;
        Node next;
        
        private Node(int val){
           this.val = val;
           this.next = null;
        }
    }


     public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;


        if(tail == null){
            tail = head;
        }
        size++;
     }



      public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        if(tail == null){
            head = tail;
        }
        size++;
      }

     
      public Node get(int index){
         Node node = head;
         for(int i=0; i<index; i++){
            node = node.next;
         }
         return node;
      }



       public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
       }



       public int deletefirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;

       }


       public int deletelast(){
        if(size <= 1){
            deletefirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.val;
        tail = secondlast;
        tail.next = null;
        return val;
       }


       public int delete(int index){
        if(index == 0){
         deletefirst();

        }
        if(index == size - 1){
            deletelast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
       }






  


      public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
      }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
         Singlyll list = new Singlyll();
         list.insertFirst(1);
         list.insertFirst(2);
         list.insertFirst(3);
         list.insertFirst(4);
        
        //  list.insert(99, 2);
        //  list.deletefirst();
        //  list.deletelast();
        //  list.delete(0, 0);
        // list.delete(0, 0);
           list.delete(2);
         list.display();

    }
}
