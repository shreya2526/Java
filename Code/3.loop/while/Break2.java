import java.util.Scanner;

class Break2 {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter a number: ");
            n=num.nextInt();
            if(n!=0)
                System.out.println("Entered number: "+n);
            else
                break;
        }
        num.close();
    }    
}
