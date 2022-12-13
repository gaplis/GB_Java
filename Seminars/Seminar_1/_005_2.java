package Seminars.Seminar_1;

public class _005_2 {
    public static void main(String[] args) {
        String[] strings = {"String", "Strin", "Str", "Stri"};
        String prefix = strings[0];

        for (int i = 0; i < strings.length; i++) {
            while (!strings[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}
