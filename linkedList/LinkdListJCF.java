package linkedList;

public class LinkdListJCF {

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

    private static Node findMid(Node head){
    Node slow = head;
    Node fast = head;
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
 private static Node merge(Node head1, Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while(head1 != null && head2 != null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while(head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergedLL.next; //-1 node dummy
}

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeSort(Node head){
    //base case
    if(head == null || head.next == null){
        return head;
    }
    //find mid
    Node mid = findMid(head);
    Node rightHead = mid.next;
    mid.next = null;

    //left and right MS
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    //merge
    return merge(newLeft, newRight);
}


    public static void main(String[] args) {
        //add
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        System.out.println("Original list:");
        print();

        head = mergeSort(head);
        System.out.println("Sorted list:");
        print();
    }
    
}
