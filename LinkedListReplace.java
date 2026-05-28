import java.util.LinkedList;

public class LinkedListReplace {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Rahul");
        names.add("Aman");
        names.add("Karan");

        System.out.println("Original List: " + names);

        // Replacing element
        names.set(1, "Rohit");

        System.out.println("Updated List: " + names);
    }
}