@SuppressWarnings("unchecked")
class MyArray<T> {
    // An object is Created and converted to Generic
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        // for(T x:A) {
        // System.out.println("x");
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Generics_2 {
    MyArray<Integer> ma = new MyArray<>();
    // ma.append(10);
    // ma.append(20);
    // ma.append(30);
    // ma.display();
}
