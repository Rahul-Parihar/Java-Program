public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // Step1= create new node
        Node newNode = new Node(data);

        size++; // this is for size of linked list

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2=newNodenext= head
        newNode.next = head; // kink

        // step3= Head=new node

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++; // this is for size of linked list

        if (head == null) {
            head = tail = newNode;
            return;

        }

        tail.next = newNode;

        tail = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;

        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);

        size++; // this is for size of linked list

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empaty  ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = prev.next.data;

        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2); all thease process is done in methods above
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();

        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

        ll.removeFirst();
        ll.print();

    }

}
