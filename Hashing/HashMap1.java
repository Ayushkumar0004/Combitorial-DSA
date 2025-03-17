import java.util.*;  // Importing the Java Utility package to use HashMap
class HashMap1 {
    public static void main(String[] args) {
        // Creating a HashMap that stores String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Virat", 18);
        map.put("Rohit", 42);
        map.put("Dhoni", 7);

        // Retrieving and printing the value associated with "Dhoni"
        System.out.println("Dhoni's number: " + map.get("Dhoni"));  // Output: 7

        // Attempting to remove "dhoni" (case-sensitive, so this will not remove anything)
        map.remove("dhoni");

        // Checking if "Dhoni" exists before removing
        if (map.containsKey("Dhoni")) 
        {
            System.out.println("\"Dhoni\" exists in the map.");
            map.remove("Dhoni");
        }
        // Checking again if "Dhoni" exists
        System.out.println("Is Dhoni present? " + map.containsKey("Dhoni")); // Output: false

        // Corrected for-each loop to iterate over the HashMap entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}