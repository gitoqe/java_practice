import java.util.Scanner;

public class task11_3_3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int N;
        N = keyboard.nextInt();
        int result = 1;
        while (result < N){
            result = result * 2;
        }
        if (result == N)
            System.out.println("Service code");
        else
            System.out.println("Not a service code");
    }
}
