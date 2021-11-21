public class task7_6 {
    public static void main(String[] args){
        int month = 12;
        System.out.println("Days in month:");
        if (month == 2)
            System.out.println(28);
        else if (month % 2 != 0 && month <= 7)
            System.out.println(31);
        else if (month % 2 == 0 && month >= 8)
            System.out.println(31);
        else
            System.out.println(30);
        System.out.println("Season of month:");
        if (month >= 6 && month <= 8)
            System.out.println("Summer");
        else if (month >= 9 && month <= 11)
            System.out.println("Autumn");
        else if (month >= 3 && month <= 5)
            System.out.println("Spring");
        else
            System.out.println("Winter");
    }
}
