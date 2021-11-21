public class task7_9 {
    public static void main(String[] args){
        double dogAge = 1.3;
        System.out.println("Dog's age in human years:");
        if (dogAge <= 2.0)
            System.out.println(dogAge * 10.5);
        else
            System.out.println(2 * 10.5 + (dogAge - 2) * 4);
    }
}
