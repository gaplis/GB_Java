package Lections.Lection_1;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();

        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d\n", a, b, c);
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.println(res);
    }
}
