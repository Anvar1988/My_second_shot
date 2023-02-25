import java.util.*;


public class Variables {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int d1 = input.nextInt();
        System.out.println("Choose " + "+-/*");


        char operation = input.next().charAt(0);
        System.out.println("Print second number");
        int d2 = input.nextInt();

        if (operation == '+') {
            System.out.println((int) (d1 + d2));

        }
            else if (operation == '-') {
                System.out.println(d1 - d2);

            }
            else if (operation == '*') {
                System.out.println(d1 * d2);

            }
            else if (operation == '/'){
                System.out.println(d1 / d2);


        } else {
            System.out.println("Incorrect operation!");


        }
    }
}

