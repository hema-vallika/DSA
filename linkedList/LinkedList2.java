package linkedList;
public class LinkedList2 {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        // step-1 create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 newNode next = head
        newNode.next = head;
        //step-3 head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step-1 create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 tail next = newNode
        tail.next = newNode;
        //step-3 tail = newNode
        tail = newNode;
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("Linked List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void print(){ //o(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle(){ //floyd's cycle finding Algo.
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;          //+1
            fast = fast.next.next;     //+2

            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    public  static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        //detect if there is a cycle
        while(fast != null && fast.next != null){
            slow = slow.next;          //+1
            fast = fast.next.next;     //+2

            if(slow == fast){
                cycle = true;
                break;
            }

        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null; //to remove cycle we need to know previous node of fast
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        head = new Node(1);
        Node temp = new Node(2);

        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; //cycle created
        // 1-2-3-2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
    }
    
}
