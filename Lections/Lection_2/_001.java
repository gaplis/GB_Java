package Lections.Lection_2;

public class _001 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis(); 
        // String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            // str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        // System.out.println(sb);
    }
}
