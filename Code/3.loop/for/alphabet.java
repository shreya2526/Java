import java.util.Scanner;

class alphabet{
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        char i;
        for(i='a';i<='z';i++){
            System.out.println("Enter an alphabet: ");
            String c=ch.next();
            System.out.println("Entered alphabet: "+c);
        }
        ch.close();
    }
}