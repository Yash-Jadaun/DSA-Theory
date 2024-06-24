public class Doublyll {
    private Node head;
    private Node tail;
    private int size;








    private class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
        
        
       public void insertFirst(int val){
        Node node = new Node(val);
        if(tail == null ){
            head = tail = node;
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
                System.out.print(temp.val + "<====>" );
                temp = temp.next;
            }
               System.out.println("End");
        }
    
    
        public void insertLast(int val){
            Node node = new Node(val);
            if(tail == null){
                head = tail = node;
            }else{
              tail.next = node;
              node.prev = tail;
              tail = node;
            }
            size++;

        }
        
        
        
      public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
      }
       
    
       public void insert(int after,int val){
        Node p = find(after);

        if(p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next =p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
       }
    

    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Doublyll list = new Doublyll();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(2, 77);
        list.display();
           
    }
}
