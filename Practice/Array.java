import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        //  int A[] = new int[ digit ]

        // Methods of declaring an Array are
        int A[] = new int[10];
        int B[] = {1,2,3,4,5};
        int C[];
        C = new int[10];

        for(int x : B){
            System.out.println(x++);
        }
        for(int i=0; i<B.length;i++) {
            System.out.println(B[i]);
        }

        //    Searching a Key
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a Key " );
        int key=sc.nextInt();
        
        
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");

        // Finding sum of Elements.

        int D[]={3,9,7,8,12,6,15,5,4,10};
        
        int sum=0;
        
        for(int x:D)
        {
            sum=sum+x;
        }
        
        System.out.println("Sum is "+sum);
        
        int E[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        
        max1=max2=E[0];
        
        for(int i=0;i<E.length;i++)
        {
            if(E[i]>max1)
            {
                max2=max1;
                max1=E[i];
                
            }
            else if(E[i]>max2)
            {
                max2=E[i];
            }
        }
        
        System.out.println("Second Largest is "+max2);

        
        
    }  
}
    
        