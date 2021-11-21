public class task7_5 {
    public static void main(String[] args){
        int Jack = 2;
        int John = 3;
        int June = 4;
        if (Jack == John && Jack == June)
            System.out.println("all equals");
        else
        if (Jack != John && Jack != June && John != June)
            System.out.println("all different");
        else
            System.out.println("equal or different");
    }
}
