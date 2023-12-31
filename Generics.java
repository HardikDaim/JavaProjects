// First of all make the Class as Generic by using <T> after the Class Name
public class Generics<T> {
    // 'T' for Generic just like a Template in C++
    // T[] is an Array
    T data[]  =(T[]) new Object[3];

    public static void main(String[] args) {
        // Create the Object of class
        Generics<String> gd = new Generics();

        gd.data[0]="Hi";
        gd.data[1]="Bye";
        // gd.data[2]=new intger(10);
        String str=gd.data[0];
    }
}