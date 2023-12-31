public class Array_2D {
    public static void main(String[] args) {
        // Syntax
        int A[][] = new int[3][4];
        // OR
        int B[][] = {{1,2,3,4},{5,6,7,8},{9,1,1,2}};
        // For Printing
       for(int i=0;i<B.length;i++) {
        for(int j=0;j<B[0].length;j++) {
            System.out.print(B[i][j] + " ");
        }
        System.out.println();
       }

    //    Alternative of Printing.
    for(int x[]:B) {
        for(int y : x) {
            System.out.print(y +" ");
        }
        System.out.println();
    }

    // Adding 2 Matrixes.
    int C[][] = {{3,5,9},{7,6,2},{1,2,3}};
    int D[][] = {{3,5,9},{7,6,2},{1,2,3}};
    int E[][] = new int[3][3];
    for(int i=0;i<C.length;i++) {
        for(int j=0;j<C[0].length;j++) {
            E[i][j] = C[i][j] + D[i][j];
        }
    }
    System.out.println();
    }
}
