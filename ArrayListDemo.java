import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();

        // Add some strings to the list
        list.add("Hello");
        list.add("World");
        list.add("!");

        // Print the list
        System.out.println("Original list: " + list);

        // Create a duplicate object of the ArrayList instance
        ArrayList<String> duplicateList = new ArrayList<>(list);

        // Print the duplicate list
        System.out.println("Duplicate list: " + duplicateList);

        // Reverse the content of the ArrayList
        Collections.reverse(list);

        // Print the reversed list
        System.out.println("Reversed list: " + list);

        // Iterate through the ArrayList using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
