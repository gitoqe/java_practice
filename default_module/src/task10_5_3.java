public class task10_5_3 {
    public static void main(String[] args){
        for (int i = 1; i <= 15; i++){
            for (int j = 1; j <= 17; j++){
                if (i >= 4 && i <= 6 && j > 4)
                    System.out.print(" ");
                else if (i >= 10 && i <= 12 && j < 13)
                    System.out.print(" ");
                else
                    System.out.print("o");
            }
            System.out.println();
        }
    }
}
