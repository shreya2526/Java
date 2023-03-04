import java.util.Scanner;

public class MathByUser {
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int product= a*b;
        int div= a/b;
        System.out.println("Addition: "+sum);
        System.out.println("Substraction: "+sub);
        System.out.println("Multiplication: "+product);
        System.out.println("Division: "+div);

    }
}
