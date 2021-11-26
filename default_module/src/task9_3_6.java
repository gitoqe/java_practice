import java.util.Scanner;

public class task9_3_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number of marks?");
        int marksNumber = keyboard.nextInt();
        int mark2 = 0, mark3 = 0, mark4 = 0, mark5 = 0, mark;
        for (int i = 1; i <= marksNumber; i++) {
            System.out.println("Set next mark: ");
            mark = keyboard.nextInt();
            if (mark % 2 == 0)
                mark4++;
            else if (mark % 13 == 0)
                mark2++;
            else if (mark % 5 == 0)
                mark5++;
            else if (mark % 3 == 0)
                mark3++;
        }
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Mark 4: " + mark4);
        System.out.println("Mark 5: " + mark5);
    }
}
