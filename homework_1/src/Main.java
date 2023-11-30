// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//            1. В методе main инициализировать все примитивные типы и не примитивные типы.
//            2. Вывести их результат в консоль:
//            char: G
//            int: 89
//            byte: 4
//            short: 56
//            float: 4.7333436
//            double: 4.355453532
//            long: 12121
//            Character: G
//            Integer: 89
//            Byte: 4
//            Short: 56
//            Float: 4.7333436
//            Double: 4.355453532
//            Long: 12121


        char ch = 'G';
        System.out.println("char: " + 'G');
        int i = 89;
        System.out.println("int: " + i);
        byte b = 4;
        System.out.println("byte: " + b);
        short s = 56;
        System.out.println("short: " + s);
        float f = 4.7333436f;
        System.out.println("float: " +f);
        double d = 4.355453532;
        System.out.println("double: " + d);
        long l = 12121;
        System.out.println("long: " + l);
        Character ch1 = 'G';
        System.out.println("Character:  " + ch1);
        Integer in = i;
        System.out.println("Integer:  " + in);
        Byte by = b;
        System.out.println("Byte:  " + by);
        Short sh = s;
        System.out.println("Short:  " + sh);
        Float fl = f;
        System.out.println("Float:  " + fl);
        Double db = d;
        System.out.println("Double:  " + db);
        Long ln = l;
        System.out.println("Long:  " + ln);


//        № 2*
//                Дано трехзначное число. Вывести на экран все цифры этого числа.
//
//                Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5


        int num = 345;
        int firstNum = num / 100;
        int secondNum = (num / 10) % 10;
        int thirdNum = num % 10;
        System.out.println("Число " +  num + "->" + firstNum + "," + secondNum + "," + thirdNum);













    }
    }
