// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class _002 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNums = ThreadLocalRandom.current();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(randomNums.nextInt(0, 10));
        }
        System.out.printf("Массив: %s\n", arr);
        arr.removeIf(integer -> integer % 2 == 0);
        System.out.printf("Изменённый массив: %s", arr);
        iScanner.close();
    }
}
