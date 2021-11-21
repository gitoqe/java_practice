public class task7_7 {
    public static void main(String[] args){
        double W = 15.3;
        double L = 15;
        double H = 10;
        int paintV = 15;
        double numberOfCans;
        numberOfCans = (2 * W * H + 2 * L * H) / paintV;
        if ((double)(int)numberOfCans < numberOfCans) // возможно, спорный момент с двойным приведением
            numberOfCans++;
        System.out.println("Min number of cans:");
        System.out.println((int) numberOfCans);
    }
}
