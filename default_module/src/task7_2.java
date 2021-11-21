public class task7_2 {
    public static void main(String[] args){
        double speed = 3.141529;
        double speedTarget = 3.141529;

        int speedNoFraction = (int) (speed * 1000);
        int speedTargetNoFraction = (int) (speedTarget * 1000);
        if (speedNoFraction == speedTargetNoFraction)
            System.out.println("Successful block");
        else
            System.out.println("They are running!");
    }
}
