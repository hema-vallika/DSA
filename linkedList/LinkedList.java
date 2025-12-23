package linkedList;

public class LinkedList {
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


    public void addMiddle(int idx, int data){
        //step-1 create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty --> addFirst
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 find prev node
        Node temp = head;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        //step-3 newNode next = temp next
        newNode.next = temp.next;
        //step-4 temp next = newNode
        temp.next = newNode;
    }


    public int removeFirst(){
        int val = head.data;
        //if linked list is empty
        if(head == null){
            System.out.println("Linked List is empty");
            return -1;
        }
        size--;
        //if linked list has only one element
        if(head == tail){
            head = tail = null;
            return val;
        }
        //step-1 head next = head
        head = head.next;
        return val;

    }


    public int removeLast(){
        int val = tail.data;
        //if linked list is empty
        if(size == 0){
            System.out.println("Linked List is empty");
            return -1;
        }
        size--;
        //if linked list has only one element
        if(head == tail){ //size = 1
            head = tail = null;
            return val;
        }
        //prev: i = size-2
        Node prev = head;
        for(int i = 0; i < size - 1; i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        return val;
    }


    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i ;
            }   
            i++;
            temp = temp.next;
        
        }
        return -1;

    }

    public int recSearchHelper(Node head, int key){
        //base case
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = recSearchHelper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key){
        return recSearchHelper(head, key);
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //if n = size --> remove first
        if(n == sz){
            head = head.next;
            return;
        }

        //sz - n -> prev
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    //slow-fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is mid node
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //step-1 find mid
        Node midNode = findMid(head);

        //step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step-3 compare both halves
        Node right = prev; //head of 2nd half
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 1);
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);
        // System.out.println("Linked List elements:");
        ll.print();
        // ll.removeFirst();
        // System.out.println("After removing first element:");
        // ll.print();
        // ll.removeLast();
        // System.out.println("After removing last element:");
        // ll.print();
        // System.out.println(ll.size);
        System.out.println("Index of 4: " + ll.itrSearch(4));
        System.out.println("Index of 10: " + ll.recSearch(10));

        
    }
    
}
