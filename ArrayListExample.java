import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Printing elements using position
        for (int i = 0; i < fruits.size(); i++) {

            System.out.println("Element at position " + i + " : " + fruits.get(i));
        }
    }
}