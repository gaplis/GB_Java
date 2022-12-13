/* Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет. */

package Homeworks.Homework_1;

import java.util.Scanner;

public class _004 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String replace = iScanner.nextLine().replace(" + ", " ").replace(" = ", " ");
        String[] exp = replace.split(" ");
        String q = exp[0];
        String w = exp[1];
        int e = Integer.parseInt(exp[2]);
        int[] result = parseExp(q, w, e);
        System.out.printf("%d + %d = %d", result[0], result[1], e);

        iScanner.close();
    }

    private static int[] parseExp(String first, String second, int res) {
        int[] nums = new int[2];
        for (int i = 0; i < 10; i++) {
            int q = Integer.parseInt(first.replace("?", String.valueOf(i)));
            for (int j = 0; j < 10; j++) {
                int w = Integer.parseInt(second.replace("?", String.valueOf(j)));
                if (q + w == res) {
                    nums[0] = q;
                    nums[1] = w;
                    return nums;
                }
            }
        }
        return nums;
    }
}
