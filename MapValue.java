import java.util.HashMap;

public class MapValue {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Get value using key
        String value = map.get(2);

        System.out.println("Value of key 2: " + value);
    }
}