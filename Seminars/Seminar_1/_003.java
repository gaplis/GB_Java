/*Найти, сколько в массиве наиболее повторяющихся подряд чисел 1 [1, 1, 0, 0, 1, 1, 1]*/

package Seminars.Seminar_1;

public class _003 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 1, 1, 1};
        int count = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (count > result){
                    result = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println(result);
    }
}
