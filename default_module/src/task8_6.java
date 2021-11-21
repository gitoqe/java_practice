public class task8_6 {
    public static void main(String[] args){
        for ( int i = 1; i <= 50; i++ )
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("*333*555*"); else
            if (i % 3 == 0)
                System.out.println("*333*"); else
            if (i % 5 == 0 )
                System.out.println("*555*");
            else
                System.out.println(i);
    }
}
