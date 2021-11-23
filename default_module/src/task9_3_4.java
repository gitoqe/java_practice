import java.util.Scanner;
public class task9_3_4 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int min = 0;
        int max = 0;
        int price;
        for (int i = 1; i <= number; i++){
            price = keyboard.nextInt();
            if (price > max)
                max = price;
            if (price < min || min == 0)
                min = price;
        }
        System.out.println("Max price: "+ max);
        System.out.println("Min price: "+ min);
    }
}
