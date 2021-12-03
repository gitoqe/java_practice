public class task10_5_1 {
    public static void main(String[] args){
        int stars = 5;
        int inRow = 0;
        for (int i = 1; i <=  stars * 2 - 1; i++) {
            if (i <= stars)
                inRow++;
            else
                inRow--;
            for (int k = 1; k <= inRow; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
