package hw_1;

public class Task_5 {
    public static void main(String[] args) {
        float a = 45.6f; // добавить f, так как по умолчанию числа с пл. точкой имеют тип double
        long b = 60000;
        long c = (long) (a / b); // необходимо ручное приведение типа к long. + один из операнд уже имеет тип long,
// соответственно тип всего выражения повышается до long
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
