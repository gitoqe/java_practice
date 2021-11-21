public class task7_8 {
    public static void main(String[] args){
        int HID = 110;
        if (HID % 5 == 0 && HID % 11 == 0)
            System.out.println("Human");
        else
            System.out.println("Zombie! Shoot him!");
    }
}
