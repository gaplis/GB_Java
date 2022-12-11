package Lections.Lection_1;

public class program {
    public static void main(String[] args) {
        System.out.println("bye world");

        String s = null;

        System.out.println(s);

        float f = 123.45f;
        double f2 = 123.45;

        System.out.println(f);
        System.out.println(f2);

        char ch = '{';
        System.out.println(ch);

        int a = 123;
        double d = a;

        System.out.println(d);

        boolean bool = true ^ false;
        System.out.println(bool);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        a = --a - a--;
        System.out.println(a);

        int inte = 8; 
        // 1000 двоичный
        // a = a << 1;
        System.out.println(inte << 1);
        // 10000
        // a = a >> 1; 
        // 100

        int a1 = 5;
        int b1 = 2;
        System.out.println(a1 | b1);
        // 101
        // 010
        // 111
        // = 7
        System.out.println(a1 & b1);
        // 101
        // 010
        // 000
        // = 0
    }
}
/*
 * Многострочный комментарий
 */
// Обычный комментарий