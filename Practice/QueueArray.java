public class QueueArray {
    int arr[];
    int index;
    int beginning;
    int size;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.size = size;
        this.index = -1;
        this.beginning = -1;
        System.out.println("The Queue is successfully created of size " + size);
    }

    // isFull
    public boolean isFull() {
        if (arr.length - 1 == index) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        if ((beginning == -1) || (beginning == arr.length)) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginning = 0;
            index++;
            arr[index] = value;
            System.out.println("Successfully inserted " + value + " in the Queue");
        } else {
            index++;
            arr[index] = value;
            System.out.println("Successfully inserted " + value + " in the Queue");
        }
    }

    // deQueue
    public void deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        } else {
            int result = arr[beginning];
            beginning++;
            if (beginning > index) {
                beginning = index - 1;
            }
        }
    }

    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(5);
        newQueue.enQueue(10);
        newQueue.enQueue(20);
        newQueue.enQueue(30);
        System.out.println(newQueue.isEmpty());
      
    }
}
