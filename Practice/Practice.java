import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //   Reverse  Coping an Array.
        int A[] = {1,2,3,4,5};
        int B[] = new int[A.length];
        for(int i=A.length - 1;i>=0;i--) {
            for(int j=0; j< B.length;j++) {
                B[j]=A[i];
                System.out.print(B[j]);
            }
        }
    }
}
 
  
       
      

    
    
    