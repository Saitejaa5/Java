public class LinkedListDemo {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = null;

        Node newNode1 = new Node(10);
        newNode1.next = head;
        head = newNode1;

        Node newNode2 = new Node(5);
        newNode2.next = head;
        head = newNode2;

        Node newNode3 = new Node(20);
        if (head == null) {
            head = newNode3;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode3;
        }

        Node newNode4 = new Node(30);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode4;

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
