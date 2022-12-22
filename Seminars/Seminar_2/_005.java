/* Напишите  метод, который вернёт содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
оно должно записаться в лог-файл*/

package Seminars.Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class _005 {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(_005.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.log(Level.WARNING, "Test logging.");
        String[] srcs = readFolder(("C:/Users/gapli/Downloads/GB_Java/Seminars/Seminar_2"));
        System.out.println(Arrays.toString(srcs));
        writeFile(srcs);
    }

    static String[] readFolder(String folder) {
        File dir = new File(folder);
        File[] list = dir.listFiles();
        String[] filenames = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            filenames[i] = list[i].getName();
        }
        // System.out.println(Arrays.toString(list));
        return filenames;
    }

    static void writeFile(String[] srcs) {
        File file = new File("file_005.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for (int i = 0; i < srcs.length; i++) {
                fw.write(srcs[i] + "\n");
                
            }  
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fw == null) {
                System.out.println("Неудача.");
            }
        }
    }
}
