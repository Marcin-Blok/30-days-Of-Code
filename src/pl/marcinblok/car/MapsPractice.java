package pl.marcinblok.car;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {
       // English Polish dictionary
        Map<String,String> engPolDictionary = new HashMap<>();
        // Putting things inside our dictionary
        engPolDictionary.put("Monday", "Poniedziałek");
        engPolDictionary.put("Tuesday", "Wtorek");
        engPolDictionary.put("Wednesday", "Środa");
        engPolDictionary.put("Thursday", "Czwartek");
        engPolDictionary.put("Friday", "Piątek");
        engPolDictionary.put("Saturday", "Sobota");
        engPolDictionary.put("Sunday", "Niedziela");

        // Retrieve things from our dictionary
        System.out.println(engPolDictionary.get("Monday"));
        System.out.println(engPolDictionary.get("Tuesday"));
        System.out.println(engPolDictionary.get("Friday"));

        // Print out all keys
        System.out.println(engPolDictionary.keySet());

        // Print out all values
        System.out.println(engPolDictionary.values());

        // Print out size
        System.out.println("The size of dictionary is: " + engPolDictionary.size());
        System.out.println();

        // Shopping list
        Map<String, Boolean> shoppingList = new HashMap<>();
        shoppingList.put("Ham" , Boolean.TRUE);
        shoppingList.put("Bread" , Boolean.TRUE);
        shoppingList.put("Oreos" , Boolean.TRUE);
        shoppingList.put("Eggs" , Boolean.FALSE);
        shoppingList.put("Milk" , Boolean.TRUE);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));

        // Key-Values pairs print out
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.entrySet());

        // Is Empty?
        System.out.println(shoppingList.isEmpty());

        // Remove item
        shoppingList.remove("Eggs");

        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        // Printing shopping list after changes
        System.out.println(shoppingList.entrySet());

        // Clear out dictionary
        shoppingList.clear();
        // Is Empty?
        System.out.println(shoppingList.isEmpty());
    }
}
