package LinkedList;

public class ReverseLL {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Iterative Approach
    private void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node prNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prNode;

            // update
            prNode = currNode;
            currNode = nextNode;
        }

        head = prNode;
    }

    // Recursive Approach
    private Node reverseRecursive(Node current) {
        if (current == null || current.next == null) {
            return current;
        }

        Node newHead = reverseRecursive(current.next);
        current.next.next = current;
        current.next = null;

        return newHead;
    }

    public void reverse() {
        head = reverseRecursive(head);
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL linkedList = new ReverseLL();
        linkedList.head = linkedList.new Node(1);
        linkedList.head.next = linkedList.new Node(2);
        linkedList.head.next.next = linkedList.new Node(3);
        linkedList.head.next.next.next = linkedList.new Node(4);
        linkedList.head.next.next.next.next = linkedList.new Node(5);

        System.out.print("Original List: ");
        linkedList.printList();

        linkedList.reverse();

        System.out.print("Reversed List: ");
        linkedList.printList();
    }
}
