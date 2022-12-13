// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homeworks.Homework_1;

import java.util.Scanner;

public class _001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();

        System.out.printf("Сумма чисел от 1 до %d = %d\n", num, sum_nums(num));
        System.out.printf("Произведение чисел от 1 до %d = %d\n", num, factorial_nums(num));
    }

    static int sum_nums(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    static int factorial_nums(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
