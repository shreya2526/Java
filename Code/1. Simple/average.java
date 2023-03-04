import java.util.Scanner;

public class average {
    public static void main(String[] args){
    System.out.println("Enter digits: ");
    Scanner dig= new Scanner(System.in);
    int a= dig.nextInt();
    int b= dig.nextInt();
    float avg= (a+b)/2.0f;
    System.out.println("Average is: "+avg);
    }
}
