public class task8_3 {
    public static void main(String[] args){
        int N = 3;
        int M = 3;
        int sum = 0;
        double avg = 0;
        if (N > M) {
            int temp = M;
            M = N;
            N = temp;
        }
        for ( int i = N; i <= M; i++ ) {
            sum += i;
            avg++;
        }
        avg = sum / avg;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }
}
