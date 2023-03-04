import java.util.Scanner;

public class swapWithoutThirdVariable {
    public static void  main(String[] args){
        Scanner in= new Scanner(System.in);
        int a, b;
        System.out.println("\nEnter two number: ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Before swapping: \nA="+a+"\nB="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: \nA="+a+"\nB="+b);
    }
}
