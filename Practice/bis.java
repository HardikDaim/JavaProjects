public class bis {
    public static void main(String[] args) {
        // Get value of Bit at particular Positiono.
        // 1. Make Bit Mask (1 << i)
        // 2. BitWise AND Operation 

        int n = 8;
        int pos = 2;
        int BitMask = 1<<pos;
        
        if((BitMask & n) == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
