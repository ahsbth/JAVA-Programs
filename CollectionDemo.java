import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        // Create a list of strings
        List<String> list = new ArrayList<>();

        // Add some strings to the list
        list.add("Hello");
        list.add("World");
        list.add("!");

        // Print the list
        System.out.println(list);

        // Get the size of the list
        System.out.println("The size of the list is " + list.size());

        // Check if a string is in the list
        System.out.println("Is 'Hello' in the list? " + list.contains("Hello"));

        // Remove a string from the list
        list.remove("Hello");

        // Print the list again
        System.out.println(list);

        // Sort the list
        Collections.sort(list);

        // Print the list again
        System.out.println(list);
    }
}
