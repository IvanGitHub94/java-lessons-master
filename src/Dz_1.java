public class Dz_1 {
    public static void main(String[] args) {
// Задача на тернарный оператор:
/////////////////////////////////
// Дана переменная sum - сумма покупки.
// Если сумма покупки больше 100000, то вывести в консоль сумму к оплате с учетом скидки в 10%,
// в противном случае вывести в консоль сумму к оплате без скидки.

        int sum = 2_000_000;

        System.out.println("Задание 1");
        System.out.println(sum > 1_000_00 ? (int) (sum - sum * 0.1) : sum);
        System.out.println("__________");

// Задача на арифметические! операторы
/////////////////////////////////
// Найти сумму цифр 2х значного числа
//
// Например,
//
// для числа 45 сумма цифр равна 9
// для числа 11 сумма цифр равна 2

        int q = 48;

        System.out.println("Задание 2");
        System.out.println( (q - q % 10) / 10 + q % 10); // 45 % 10 = 5 !
        System.out.println("__________");

// Задача на арифметические операторы
/////////////////////////////////
// Даны длина, ширина и высота прямоугольного параллелепипеда.
// Найти и вывести в консоль его площадь.

        int length = 8;
        int width = 5;
        int height = 4;

        int square = 2 * (length * width + width * height + length * height);

        System.out.println("Задание 3");
        System.out.println( "Площадь прямоугольного параллелепипеда со сторонами " + length + ", " + width + ", " + height + " равна " + square);
        System.out.println("__________");

        float a = 45.6f; // добавить f, так как по умолчанию числа с пл. точкой имеют тип double
        long b = 60000; // l в конце не обязательно добавлять, так как число входит в диапазон int по-умолчанию
        long c = (long) (a / b); // необходимо ручное приведение типа к long. + один из операнд уже имеет тип long,
// соответственно тип всего выражения понижается до long
// но если один из операнд с плавающей точкой в то же время, результат тоже должен быть с плавающей точкой
// а тип переменной с куда записывается результат - long

        int x = 34;
        long y = 78;
        int z = (int) (x / y); // необходимо привести к int, так как у long диапазон значений больше,
// при выполнении операции есть вероятность получить переполнение int

        double n = 90.8;
        double m = -100.1;
        int max = (int) (n > m ? n : m); // обе операнды выражения - числа с плавающей точкой (+ диапазон значений у double выше)

        byte code = 1;
// boolean isActive = (boolean) code; нельзя числа привести к логическому липу boolean
    }
}