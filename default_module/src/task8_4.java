public class task8_4 {
    public static void main(String[] args){
        int N = 5;
        int sum = 0;
        for ( int i = 1; i <= N; i++)
            if (i % 2 != 0)
                sum += i;
        System.out.println("Sum of odd numbers up to " + N + " is: " + sum);
    }
}
