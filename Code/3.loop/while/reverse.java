import java.util.Scanner;

class reverse {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n, rev=0;
        System.out.print("Enter a number: ");
        n=num.nextInt();
        while(n!=0){
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        System.out.println(rev);
        num.close();
    }    
}
