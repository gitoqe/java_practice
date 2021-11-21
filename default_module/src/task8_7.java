public class task8_7 {
    public static void main (String[] args){
        int hour = 8;
        int checkSum = 0;
        for (int i = 2; i < hour; i++ )
            if (hour % i == 0)
                checkSum += i;
        if (checkSum % 2 == 0)
            System.out.println("Loves. <3");
        else
            System.out.println("Does not love. </3");
    }
}
