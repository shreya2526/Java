import java.util.Scanner;

class IntegerPrint{
    public static void main(String[] args){
        System.out.print("Enter an integer: ");
        int n;
        Scanner num=new Scanner(System.in);
        while((n=num.nextInt())!=0){
            System.out.println("You have entered: "+n);
            System.out.println("Enter an integer: ");
        }
        System.out.println("Out of the loop");
        num.close();
    }
}