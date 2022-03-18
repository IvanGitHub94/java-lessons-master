package hw03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Пример:

        // int q = 223471; // 2 + 2 + 3 + 4 + 7 + 1 = 19

        // q / 10000 % 10 + q / 1000 % 10 + q / 100 % 10 + q / 10 % 10 + q / 1 % 10
        // тут на каждом шаге получаем остаток, который складывается с последующими

        // разрядность числа, на которое делится q с каждым шагом уменьшается,
        // таких шагов будет (количество цифр в числе - 1), пояснение ниже с count

        // (цифры на конце каждого разряда - для 223471 это будет сперва 1, потом 7, затем 4 и так далее)

        System.out.println("Введите число:");
            Scanner scanner = new Scanner(System.in);
            int w = scanner.nextInt();
            int e = w;   // запоминаем значение в отдельную переменную для дальнейшего использования,
                        // так как w изменится далее в цикле

        int count = 0;
        while ( 0 != w) {
            w = w / 10;
            count++;
        } // если честно, этот цикл подглядел в сети, остальное все сам =)
        System.out.println("Количество цифр в данном числе: " + count); // здесь я узнаю количество цифр в числе

        int sum = 0;
        while (count != 0) {
            count--;
            //sum = sum + (e / (int) Math.pow(10.0, count) % 10); // вариант покороче со степенью
            int h = 1;
            for (int i = 0; i < count; i++) {
                h = h * 10;
            }
            sum = sum + (e / h % 10);
        }
        System.out.println("Сумма всех цифр в данном числе: " + sum);
    }
}