import java.util.Scanner;

public class largerInThree{
    public static void main(String[] args){
        int x, y, z;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter three number: ");
        x=num.nextInt();
        y=num.nextInt();
        z=num.nextInt();
        if(x>y && x>z)
            System.out.println("First is largest");
        else if(y>z)
            System.out.println("Second largest");
        else
            System.out.println("Third largest");
    }
}