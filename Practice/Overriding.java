
class TV {
    public void switchON(){System.out.println("TV is Switched ON.");}
    public void changeChannels(){System.out.println("TV Channel is Changed.");}
}
class SmartTV extends TV{
    @Override
    public void switchON(){System.out.println("SmartTV is Switched ON.");}
    @Override
    public void changeChannels(){System.out.println("SmartTV Channel is Changed.");}
    public void Browse(){System.out.println("SmartTV is Browsing.");}
}

public class Overriding {
    public static void main(String[] args) {
        // Dynamic Method Dispatch.
        // Output Comes on the basis of object SmartTV not on the basis of reference TV.
        TV t = new SmartTV();
        t.changeChannels();
        t.switchON();
    }
}
