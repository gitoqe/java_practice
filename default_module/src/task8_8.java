public class task8_8 {
    public static void main (String[] args) {
        // 1 - ger, 5 - phi, 9 - cac
        int left = 1;
        int center = 5;
        int right = 9;
        int temp;
        int N = 10;
        System.out.println("Start: " + left + center + right);
        for ( int i = 1; i <= N; i++ ){
            // Oksana: right<->center
            temp = right;
            right = center;
            center = temp;
            // Oleg: left<->center
            temp = left;
            left = center;
            center = temp;
        }
        System.out.println("End: " + left + center + right);
    }
}
