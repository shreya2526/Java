import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= num.nextInt();
        int i, fact=1;
        
        if(n<0)
            System.out.println("Factorial of "+n+" is: "+fact);
        else{
            for(i=1;i<=n;i++)
                fact=fact*i;
            System.out.println("Factorial of "+n+" is: "+fact);
        }
    }    
}
