public class task8_2 {
    public static void main(String[] args){
        int N = 10;
        int sum = 0;
        for ( int i = 1; i <= N; i++ )
            sum += i * i;
        System.out.println("Sum of squares of " + N + " numbers is: " + sum);
    }
}
