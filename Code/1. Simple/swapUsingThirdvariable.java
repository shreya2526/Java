import java.util.Scanner;
public class swapUsingThirdvariable {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int temp;
        System.out.println("Enter two numbers: ");
        int a= num.nextInt();
        int b= num.nextInt();
        System.out.println("Before swapping: \n");
        System.out.println("A="+a);
        System.out.println("B="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: \n");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }  
}
