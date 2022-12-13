// Вывести все простые числа от 1 до 1000

package Homeworks.Homework_1;

public class _002 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (findSimple(i)) {
                System.out.println(i);;
            }
        }
    }

    static boolean findSimple(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
