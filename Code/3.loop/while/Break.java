import java.util.Scanner;

class Break {
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            n = num.nextInt();

            if (n == 0) {
                System.out.println("program terminated");
                break;
            }
            System.out.println("You have entered: " + n);
        }
        num.close();

    }
}
