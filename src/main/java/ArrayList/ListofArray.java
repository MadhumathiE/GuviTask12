package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ListofArray {


    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        
        // Convert the List to an array of strings
        String[] stringArray = new String[stringList.size()];
        stringList.toArray(stringArray);
        
        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (String item : stringArray) {
            System.out.println(item);
        }
    }
}


