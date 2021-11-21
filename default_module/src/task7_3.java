public class task7_3 {
    public static void main(String[] args){
        int year = 1994;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Normal year");
    }
}
