/* Првоерить является ли строка палиндромом.
Пример: aaabbcbbaaa */

package Seminars.Seminar_2;

public class _003 {
    public static void main(String[] args) {
        String palindrom = "aaabbcbbaaa";
        String notPalindrom = "aaabbcbbxaaa";
        System.out.println(isPalindrom(palindrom));
        System.out.println(isPalindrom(notPalindrom));
    }

    static boolean isPalindrom(String abc) {
        boolean res = true;
        for (int i = 0; i < abc.length() / 2; i++) {
            if (abc.charAt(i) != abc.charAt(abc.length() - 1 - i)) {
                res = false;
                break;
            }
        }
        return res;
    }
}
