/* Дана строка sql-запроса "SELECT * FROM students WHERE ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

package Homeworks.Homework_2;

import java.util.Objects;

public class _001 {
    public static void main(String[] args) {
        StringBuilder request = new StringBuilder("SELECT * FROM students WHERE ");
        String filtration = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] result = filtration.replace("{\"", "")
                .replace("\":\"", " ")
                .replace("\", \"", " ")
                .replace("\"}", "").split(" ");
        for (int i = 0; i < result.length; i += 2) {
            if (i + 2 != result.length && i != 0) {
                request.append(" AND ");
            }
            if (!Objects.equals(result[i + 1], "null")) {
                request.append(result[i]).append(" = ").append("'").append(result[i + 1]).append("'");
            }
        }
        request.append(";");
        System.out.println(request);
    }
}
