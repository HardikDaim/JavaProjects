class MyData {
    // Method
    // Synchronize Lets One Threat to run First after the Another and don't let them to mixup.
   synchronized public void display(String str) {
        for(int i = 0; i< str.length();i++) {
            System.out.print(str.charAt(i));
            // Try and Catch for Exception Hangling
            // Throws and Throw to Exception Handling
            try {Thread.sleep(100);}
            catch(Exception e) {}
        }
    }
}
// Thread Class
class MyThreat1 extends Thread {
    MyData d;
    // Constructor
    public MyThreat1(MyData d) {
        this.d = d;
    }
    public void run() {
        d.display("Hello World");
    }
}
// Thread Class
class MyThreat2 extends Thread {
    MyData d;
    // Constructor
    public MyThreat2(MyData d) {
        this.d = d;
    }
    public void run() {
        d.display("Welcome All ");
    }
}


public class Sync {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThreat1 t1 = new MyThreat1(d);
        MyThreat2 t2 = new MyThreat2(d);
         
        t1.start();;
        t2.start();;
    }
    
}
