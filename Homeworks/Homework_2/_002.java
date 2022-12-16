//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Homeworks.Homework_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _002 {
    public static void main(String[] args) throws IOException {
        FileHandler file = new FileHandler("C:/Users/gapli/Downloads/GB_Java/Homeworks/Homework_2/log_002.xml", true);
        Logger logger = Logger.getLogger(_002.class.getName());
        int[] array = {4, 67, 675, 43, 765, 254, 876, 3, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                logger.addHandler(file);
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(array));
            }
        }
    }
}
