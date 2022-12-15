package Lections.Lection_2;

public class _002 {
    public static void main(String[] args) {
        String[] name = {"С", "е", "р", "г", "е", "й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Сергей
        System.out.println(String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
        System.out.println(String.join(",", "С", "е", "р", "г", "е", "й")); // С,е,р,г,е,й
    }
}
