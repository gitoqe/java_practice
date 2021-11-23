public class task9_3_3 {
    public static void main (String[] args) {
        int X = 12;
        int Y = 84;
        int NOD = 0;
        for ( int i = X; i >= 1; i--)
            if (X % i == 0 && Y % i == 0) {
                NOD = i;
                break;
            }
        System.out.println("greatest common factor: " + NOD);
    }
}
