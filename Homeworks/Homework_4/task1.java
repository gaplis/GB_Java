// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Homeworks.Homework_4;


import java.util.concurrent.ThreadLocalRandom;
import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNums = ThreadLocalRandom.current();
        LinkedList<Integer> array = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер: ");
        int size = iScanner.nextInt();
        for (int i = 0; i < size; i++) {
            array.add(randomNums.nextInt(0, 10));
        }
        System.out.println(array);
        reverseArray(array);
        System.out.println(array);
        iScanner.close();
    }

    static void reverseArray(LinkedList<Integer> array) {
        for (int i = 0; i < (array.size() + 1) / 2; i++) {
            int temp = array.get(i);
            array.set(i, array.get(array.size() - 1 - i));
            array.set(array.size() - 1 - i, temp);
        }
    }
}
