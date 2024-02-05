package LinkedList;

public class LL {
    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Declare head as an instance variable


    // add at start
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add to last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print LinkedList
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete from Start
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;

    }
    // Delete from Start
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is Empty");
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head; 
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast  = secondLast.next;
        }
        secondLast.next = null;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("3");
        list.addFirst("5");
        list.addLast("7");

        list.printList();

        list.addLast("15");
        list.printList();
    }
}
