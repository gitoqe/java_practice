public class task9_3_5 {
    public static void main(String[] args){
        int number = 123321;
        int firstPart = number / 100000 + number / 10000 % 10 + number / 1000 % 10;
        int secondPart = number % 1000 / 100 + number  % 100 / 10 + number % 10;
        if (firstPart == secondPart)
            System.out.println("Lucky! Eat it!");
        else
            System.out.println("Unlucky!");
    }
}
