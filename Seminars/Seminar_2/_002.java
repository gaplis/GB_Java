/* Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
 */

package Seminars.Seminar_2;

public class _002 {
    public static void main(String[] args) {
        String abc = "aaaabbbcddddddd ";
        System.out.println(abc);
        System.out.println(zip(abc));
    }
    
    static String zip(String full) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        String var1, var2;
        for (int i = 0; i < full.length() - 1; i++) {
            var1 = full.substring(i, i+1);
            var2 = full.substring(i+1, i+2);

            if (var1.equals(var2)) {
                count++;
            } else {
                res = res.append(count).append(var1);
                count = 1;
            }
        }
        return res.toString();
    }
}
