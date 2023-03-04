import java.util.Scanner;

public class result {
    public static void main(String[] args) {

        Scanner res = new Scanner(System.in);

        float eng, maths, science, computer, total;

        System.out.println("Enter your marks down below!");

        System.out.println("Eng: ");
        eng = res.nextFloat();

        System.out.println("Maths: ");
        maths = res.nextFloat();

        System.out.println("Science: ");
        science = res.nextFloat();

        System.out.println("Computer: ");
        computer = res.nextFloat();

        total = eng + maths + science + computer;

        System.out.println("Your total marks: " + total);

        if (total >= 390)
            System.out.println("You've got A+ !!");
        else if (total >= 350)
            System.out.println("You've got A !!");
        else if (total >= 300)
            System.out.println("You've got B+");
        else if (total >= 250)
            System.out.println("You've got B");
        else if (total >= 200)
            System.out.println("You've got C");
        else
            System.out.println("Failed!");

            res.close();
    }
}