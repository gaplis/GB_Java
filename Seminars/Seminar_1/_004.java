/*Отсортировать, чтобы сначала были двойки, а потом тройки [2, 2, 3, 2, 3, 2, 2, 3, 3]*/

package Seminars.Seminar_1;

import java.util.Arrays;

public class _004 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 2, 3, 2, 2, 3, 3};
        int length = array.length-1;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < length; i++) {
            if (array[i] == 3) {
                while  (array[length] == 3 && length > i) {
                    length--;
                }
                int temp = array[length];
                array[length] = array[i];
                array[i] = temp;
            }
        }

        System.out.println(Arrays.toString(array));        
        
    }
}
