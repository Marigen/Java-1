public class FirstLesson {

    /*Все задания сделаны по порядку
    * Студент - Мартаков Игорь Геннадьевич*/

    //Примитивные типы данных:
    //1. Целочиленные
    byte firstType = 1;
    short secondType = 2;
    int thirdType = 4;
    long forthType = 8L;

    //2. Вещественные, с плавающей точкой
    float fifthType = 4.0f;
    double sixthType = 8.0;

    //3. Символьный тип данных
    char seventhType = 't';

    //Ссылочный тип данных
    String eighthType = "Какая-то строка любого размера";

    //4. Логический тип данных
    boolean yes = true;
    boolean no = false;

    public static void main(String[] args) {

        System.out.println(performCalculation(5, 6, 8, 10));
        System.out.println(performCalculation(563.3f, 3.1f, 50, 10));

        System.out.println(isSumInRange(5, 10));
        System.out.println(isSumInRange(10, 15));

        ifSumInRange(10, 20);
        ifSumInRange(5, 6);

        isPositive(5);
        isPositive(-1);

        isNegative(-2);
        isNegative(2);

        printHelloUser("Илья");
        printHelloUser("Igor");

        leapYearCalculation(4);
        leapYearCalculation(3);
        leapYearCalculation(108);
        leapYearCalculation(100);
        leapYearCalculation(200);
        leapYearCalculation(400);
        leapYearCalculation(800);
        leapYearCalculation(900);

    }

    public static float performCalculation(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    public static String isSumInRange(int a, int b) {
        int c = a + b;

        String result = c >= 10 & c <= 20 ? "Сумма чисел " + a + " и " + b + " удовлетворяет условию задачи" :
                "Сумма чисел " + a + " и " + b + " не удовлетворяет условию задачи";

        return result;
    }

    public static void ifSumInRange(int a, int b) {
        int c = a + b;

        if (c >= 10 & c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void isPositive(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    public static void isNegative(int a) {
        if (a < 0) {
            System.out.println(true);
        }
    }

    public static void printHelloUser(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYearCalculation(int a) {
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " - високосный год");
        } else {
            System.out.println(a + " - невисокосный год");
        }
    }

}
