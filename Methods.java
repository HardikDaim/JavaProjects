public class Methods {

    static int max(int x , int y) {
        // if retrun then No use of VOID.
        if(x>y)
            return x;
        else
         return y;     
        //  OR
        // return x>y? x;y;
        // Means if x>y then return x else y. 

    }
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(max(a,b));
    }
}
