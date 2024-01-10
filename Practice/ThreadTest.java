
public class ThreadTest implements Runnable  {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
public static void main(String[] args) {
    ThreadTest t = new ThreadTest();
    Thread th = new Thread(t);
    th.start();;
    int i = 1;
    while(true) {
        System.out.println(i + "World");
        i++;
    }
}
}
