package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Map<String, String> englSpanDictionary = new HashMap<String, String>();

        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");

        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        System.out.println(englSpanDictionary.keySet());

        System.out.println(englSpanDictionary.values());

        System.out.println("The size of our dictionary is " + englSpanDictionary.size());
    }
}
