// Interface inplements all the functions of Abstract Classes
class Phone {
    public void Call(){System.out.println("Phone Call");}
    public void SNS(){System.out.println("Phone Sending SMS");}
}
// Using Interface instead of using Abstract & Public all the Time
interface ICamera {
    void Click();
    void Record();
}
interface IMusicPlayer {
    void Play();
    void Stop();
}
class SmartPhone extends Phone implements ICamera , IMusicPlayer {

    public void VideoCall(){System.out.println("Smart Phone Video Calling");}
    public void Click(){System.out.println("Smart Phone Clicking Photo");}
    public void Record(){System.out.println("Smart Phone Recording Videos");}
    public void Play(){System.out.println("Smart Phone Playing Music");}
    public void Stop(){System.out.println("Smart Phone Stop Music");}
    
}
public class Interface {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.Call();;
        sp.SNS();
        
    }
}