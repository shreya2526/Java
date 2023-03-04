import java.util.*;

class halfTriangle{
    public static void main(String[] args){
        int i, j, n1;
        Scanner pat = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        n1=pat.nextInt();
        for(i=0;i<n1;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        pat.close();
    }
}