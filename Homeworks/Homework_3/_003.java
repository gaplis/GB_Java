// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class _003 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNums = ThreadLocalRandom.current();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(randomNums.nextInt(0, 10));
        }
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.printf("Массив: %s\n", arr);
        System.out.printf("Минимальное значение: %s\nМаксимальное значение: %s\nСреднее значение: %s",
                Collections.min(arr),
                Collections.max(arr),
                (double) sum / size);
        iScanner.close();
    }
}
