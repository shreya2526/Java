import java.util.*;

class primeUser {
    public static void main(String[] args){
        int n, i;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=num.nextInt();
        for(i=2;i<=n;i++){
            if(n%i==0){
                System.out.println("Not prime");
                break;
            }
            else
                System.out.println("Prime");
        }
        num.close();
        
    }
}
