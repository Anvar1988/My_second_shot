import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input month of birth (2 digit number)");
        int x = s.nextInt();
        System.out.println("input day of birth (2 digit number");
        int c = s.nextInt();
        System.out.println("Input year of birth (4 digit number");
        int y = s.nextInt();
        System.out.println("Your date of birth is: " + x + "/" + c + "/" + y);



    }
}
