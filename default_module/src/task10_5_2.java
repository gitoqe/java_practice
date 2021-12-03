public class task10_5_2 {
    public static void main(String[] args){
        int j = 0;
        for (int i = 1; i <= 7; i++){
            if (i == 1 || i == 7)
                j = 5;
            else if (i == 4)
                j = 4;
            else
                j = 1;
            for ( ; j >=1; j--)
                System.out.print('*');
            System.out.println();
        }
    }
}
