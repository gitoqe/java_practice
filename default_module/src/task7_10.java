public class task7_10 {
    public static void  main(String[] args){
        int ox = 1999;
        int bf = 2001;
        if (ox < 1900 || ox > 2100 || bf < 1990 || bf > 2100)
            System.out.println("Wrong birth year numbers"); else
        if (ox / 1000 + ox / 100 % 10 + ox % 100 / 10 + ox % 10 > bf / 1000 + bf / 100 % 10 + bf % 100 / 10 + bf % 10)
            System.out.println("Match!");
        else
            System.out.println("Wrong boyfriend!");
    }
}
