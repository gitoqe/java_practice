import java.util.Scanner;

public class task9_3_2 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number;
        int i;
        System.out.println("Set number of routers: ");
        number = keyboard.nextInt();
        for ( i = 1; i <= number; i++ ) {
            System.out.println("Set code: ");
            int vulnerability;
            vulnerability = keyboard.nextInt();
            if (vulnerability == 171)
                break;
        }
        if (i - 1 != number)
            System.out.println("Router №" + i + " is vulnerable");
        else
            System.out.println("No vulnerabilities found");
    }
}
