public class task7_1 {
    public static void main(String[] args){
        double incomeJunior = 410;
        double incomeMiddlePlus = 1150;
        double incomeSenior = 1100;
        double max;
        double min;

        if (incomeJunior >= incomeMiddlePlus && incomeJunior >= incomeSenior) {
            System.out.println("Max income - Junior");
            max = incomeJunior;
        } else if (incomeMiddlePlus >= incomeSenior) {
            System.out.println("Max income - Middle plus");
            max = incomeMiddlePlus;
        } else {
            System.out.println("Max income - Senior");
            max = incomeSenior;
        }

        if (incomeJunior <= incomeMiddlePlus && incomeJunior <= incomeSenior) {
            System.out.println("Min income - Junior");
            min = incomeJunior;
        } else if (incomeMiddlePlus <= incomeSenior) {
            System.out.println("Min income - Middle plus");
            min = incomeMiddlePlus;
        } else {
            System.out.println("Min income - Senior");
            min = incomeSenior;
        }
        System.out.println("Income difference (max/min):");
        System.out.println(max / min);
    }
}
