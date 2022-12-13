package Seminars.Seminar_1;

import java.util.Arrays;

public class _005 {
    public static void main(String[] args) {

        String[] strings = {"String", "Strin", "Str", "Stri"};
        int min = 0;

        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {             // данный вариант не очень подходит, так как он ощет минимальный размер,
            if (strings[i].length() < strings[min].length()) { // но если будет "String", "Strin", "Sta", "Stri", то искать все равно нужно,
                min = i;                                       // но уже St, а не Str
            }
        }

        boolean[] bool = new boolean[strings.length];
        int count = 0;

        for (int i = 0; i < strings.length; i++) {
            bool[i] = strings[i].startsWith(strings[min]);
            if (bool[i] == true) {
                count++;
            }
        }

        if (count == strings.length) {
            System.out.printf("%s", strings[min]);
        } else {
            System.out.println("''");
        }

    }
}
