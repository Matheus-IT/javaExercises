package shoppinglist;

import java.util.Map;
import java.util.HashMap;

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
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", true);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        shoppingList.remove("Eggs");

        shoppingList.replace("Bread", false);

        System.out.println(shoppingList.toString());
        System.out.println("Is shoppingList empty? " + shoppingList.isEmpty());
        
        shoppingList.clear();
        
        System.out.println(shoppingList.toString());
        System.out.println("Is shoppingList empty? " + shoppingList.isEmpty());

    }
}
