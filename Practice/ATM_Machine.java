class ATM {
        // Method
        // Synchronize Lets One Threat to run First after the Another and don't let them to mixup.
    synchronized public void checkBalance(String name) {
       System.out.print(name + " Checking ");
        // Try and Catch for Exception Hangling
         // Throws and Throw to Exception Handling
       try{Thread.sleep(1000);}catch(Exception e){}
       System.out.println("Balance");
    }
    
    synchronized public void withdraw(String name,int amount) {
        System.out.print(name + " withdrawing "); 
        
        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(amount);
        
    }
}
// Thread Class
class Customer extends Thread {
    String name;
    int amount;
    ATM atm;
    // Constructor
    Customer(String n,ATM a,int amt) {
        name=n;
        atm=a;
        amount=amt;
    }
    // Method
    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    // Method for Running 
    public void run() {
        useATM();
    }
}
public class ATM_Machine 
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
    }   
}