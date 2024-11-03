import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //создали мап  и добавляем данные
        map.put("a", "Билл");
        map.put("b", "Анна");
        map.put("c", "Дима");
        map.put("d", "Кира");
        map.put("e", "Марина");
        System.out.println("---ДО ЗАМЕНЫ---");
        System.out.println(map);
        swapValue(map, "a", "b");
        System.out.println("---СМЕНА ПЕРВЫХ ДВУХ МЕСТАМИ---");
        System.out.println(map);
        swapValue(map, "j", "e");
        System.out.println("---МАРИНА ПОМЕНЯЛАСЬ С ПУСТЫМ---");
        System.out.println(map);
        swapValue(map, "e", "k");
        System.out.println("---ТАМ ГДЕ БЫЛА РАНЬШЕ МАРИНА(ПУСТОТА) И ПУСТОТА к---");
        System.out.println(map);
        swapValue(map, "b", "k");
        System.out.println("---Билл ушел в к---");
        System.out.println(map);

    }
    public static void swapValue(Map<String, String> map, String key1, String key2) {
        if (!map.containsKey(key1)) { //ищем ключ1 в мап, если нету то присваиваем пустое значение
            map.put(key1, "");
        }
        if (!map.containsKey(key2)) { // то же самое с кей2
            map.put(key2, "");
        }
        String pomenyat = map.get(key1); //берем значение первого ключа кладем в переменную для смены, потом присваиваем ему значение 2 ключа. а второму переменную.
        map.put(key1, map.get(key2));
        map.put(key2, pomenyat);
    }
}
