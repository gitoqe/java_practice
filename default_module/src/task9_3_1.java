public class task9_3_1 {
    public static void main (String[] args) {
        int counter = 0;
        for ( int i = 100; i <= 400; i++ )
            if (i % 7 == 0)
                counter++;
        System.out.println(counter);
    }
}
