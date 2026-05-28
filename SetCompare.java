import java.util.HashSet;

public class SetCompare {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("Banana");
        set1.add("Mango");

        set2.add("Banana");
        set2.add("Mango");
        set2.add("Orange");

        // Retain same elements
        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}