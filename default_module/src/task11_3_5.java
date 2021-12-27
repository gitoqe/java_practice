import java.util.Scanner;

public class task11_3_5 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int X;
        int Y;
        X = keyboard.nextInt();
        Y = keyboard.nextInt();
        int total = 0;
        int day = 0;
        while (X - 2 * Y > 0){
            day++;
            if (day == 1)
                total += X;
            else if (day == 2)
                total += X - Y;
            else {
                Y += Y;
                total += X - Y;
            }
            System.out.println(day + ") X:" + X + " - Y:" + Y + " res:" + (X - Y) +  " Honey: " + total);
        }
        System.out.println("Honey: " + total);
        System.out.println("Days: " + day);
    }
}
