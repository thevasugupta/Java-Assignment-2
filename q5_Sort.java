import java.util.ArrayList;
import java.util.Collections;

public class q5_Sort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.sort((a, b) -> b.compareTo(a)); // Lambda for descending order
        System.out.println("Sorted Strings: " + names);
    }
}
