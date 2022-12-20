/* Есть некая строка.
Нужно записать её в файл 100 раз. */

package Seminars.Seminar_2;

import java.io.FileWriter;
import java.io.IOException;

public class _004 {
    public static void main(String[] args) throws IOException{
        String s = "Test";
        FileWriter fw = new FileWriter("file_004.txt");
        for (int i = 0; i < 100; i++) {
            fw.write(s + "\n");
        }
        fw.close();
    }
}
