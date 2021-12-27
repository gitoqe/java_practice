public class task11_3_4 {
    public static void main(String[] args){
        /*
        Удалите из числа, состоящего из двух или более разрядов,
        заданную цифру. Например, если из числа 1203453 удалить цифру 3, то получится число 12045.
        Использовать можно только арифметические операции.
         */
        int number = 1203453;
        int delNumber = 3;
        int digit = 0;
        int result = 0;
        while (number / 10.0 > 0){
            int temp = number % 10;
            number = number / 10;
            if (temp != delNumber) {
                digit++;
                int coefficient = 1;
                while (coefficient <= digit - 1) {
                    coefficient++;
                    temp = temp * 10;
                }
                result = result + temp;
            }
        }
        System.out.println(result);
    }
}
