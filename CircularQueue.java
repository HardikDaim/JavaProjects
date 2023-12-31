public class CircularQueue {
    int arr[];
    int index;
    int beginning;
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.index = -1;
        this.beginning = -1;
        System.out.println("The Circular Queue is successfully created of size " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (index == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (beginning == index + 1) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Circular Queue is Full");
        } else if (isEmpty()) {
            beginning = 0;
            index++;
            System.out.println("Successfully inserted " + value + " in the Circular Queue");
        } else {
            if (index + 1 == size) {
                index = 0;
            } else {
                index++;
            }
            arr[index] = value;
            System.out.println("Successfully inserted " + value + " in the Circular Queue");
        }
    }

    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(6);
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.enQueue(40);
    }
}