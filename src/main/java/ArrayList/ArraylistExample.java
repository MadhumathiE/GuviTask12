package ArrayList;
import java.util.ArrayList;
public class ArraylistExample {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        
        // Displaying the ArrayList before removing elements
        System.out.println("ArrayList before removing elements: " + stringList);
        
        // Removing all elements from the ArrayList
        stringList.clear();
        
        // Displaying the ArrayList after removing elements
        System.out.println("ArrayList after removing elements: " + stringList);
    }

}