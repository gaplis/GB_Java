package Lections.Lection_1;

import java.io.FileWriter;

public class file {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
