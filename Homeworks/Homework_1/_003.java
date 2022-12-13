//Реализовать простой калькулятор

package Homeworks.Homework_1;

import java.util.Scanner;

public class _003 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = iScanner.nextInt();
        System.out.print("Введите действие (*, /, +, -): ");
        String operation = iScanner.next();
        
        switch (operation) {
            case ("+"): 
                System.out.printf("%d + %d = %d", firstNum, secondNum, firstNum + secondNum);
                break;
            case ("-"): 
                System.out.printf("%d - %d = %d", firstNum, secondNum, firstNum - secondNum);
                break;
            case ("*"): 
                System.out.printf("%d * %d = %d", firstNum, secondNum, firstNum * secondNum);
                break;
            case ("/"): 
                System.out.printf("%d / %d = %d", firstNum, secondNum, firstNum / secondNum);
                break;
            default:
                System.out.print("Неверное значение.");
                break;
        }

        iScanner.close();
    }
}
