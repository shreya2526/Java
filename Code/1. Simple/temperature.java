import java.util.*;

public class temperature{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    float temp;
    System.out.println("Enter temperature in Farenheit: ");
    temp=in.nextFloat();
    temp=((temp-32)*5)/9;
    System.out.println("Temperature in Celsious: "+temp);        
    }
}