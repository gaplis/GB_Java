/* Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернёт строку строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. */

package Seminars.Seminar_2;

import java.util.Scanner;

public class _001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер строки: ");
        int n = iScanner.nextInt();
        System.out.println(resolve(n, '1', '2'));
        iScanner.close();
    }

    static String resolve(int n, char a, char b) {
        StringBuilder sb = new StringBuilder();
        String res = "";
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                sb.append(a);
            } else {
                sb.append(b);
            }
        }
        res = sb.toString();
        return res; // return sb.toString();
    }
}
