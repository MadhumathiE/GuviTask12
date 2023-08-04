package ArrayList;
import java.util.TreeMap;
public class TreeMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store employee ID and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        
        // Adding employee ID and names to the TreeMap
        employeeMap.put(101, "Madhu");
        employeeMap.put(102, "vignesh");
        employeeMap.put(103, "sanjeevi");
        employeeMap.put(104, "Saranya");
        
        // Printing names of all employees in alphabetical order
        System.out.println("Names of all employees in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}





