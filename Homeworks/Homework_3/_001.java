// Реализовать алгоритм сортировки слиянием

package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class _001 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNums = ThreadLocalRandom.current();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(randomNums.nextInt(0, 10));
        }
        System.out.printf("Массив: %s\n", array);
        ArrayList<Integer> res = mergeSort(array);
        System.out.println(res);
        iScanner.close();
    }

    static ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
        int leftMin;
        int rightMin;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        if (array.size() == 1) {
            return array;
        }
        for (int i = 0; i < array.size(); i++) {
            if (i < (array.size() + 1) / 2) {
                left.add(array.get(i));
            } else {
                right.add(array.get(i));
            }
        }
        left = mergeSort(left);
        right = mergeSort(right);
        ArrayList<Integer> res = new ArrayList<>();
        while (left.size() > 0 || right.size() > 0) {
            if (left.size() > 0) {
                leftMin = Collections.min(left);
                if (right.size() > 0) {
                    rightMin = Collections.min(right);
                } else if (left.size() > 1) {
                    leftMin = Collections.max(left);
                    rightMin = Collections.min(left);
                } else {
                    res.add(leftMin);
                    return res;
                }
            } else if (right.size() > 1) {
                leftMin = Collections.max(right);
                rightMin = Collections.min(right);
            } else {
                rightMin = Collections.min(right);
                res.add(rightMin);
                return res;
            }
            if (leftMin < rightMin) {
                res.add(leftMin);
                if (left.size() > 0) {
                    left.remove((Object) leftMin);
                } else {
                    right.remove((Object) rightMin);
                }
            } else if (leftMin > rightMin) {
                res.add(rightMin);
                if (right.size() > 0) {
                    right.remove((Object) rightMin);
                } else {
                    left.remove((Object) rightMin);
                }

            } else {
                res.add(leftMin);
                left.remove((Object) leftMin);
            }
        }
        System.out.println(res);
        return res;
    }
}
