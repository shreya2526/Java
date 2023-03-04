import java.util.Scanner;

class FirstNintegers{
    public static void main(String[] args){
        int i;
        System.out.print("enter limit: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(i=1;i<=n;i++)
            System.out.println(i); 

    }
}