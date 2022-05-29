import java.util.LinkedHashSet;
import java.util.Set;

public class App60 {

    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<String>();
        LinkedHashSet.add("Java");
        LinkedHashSet.add("C++");
        LinkedHashSet.add("C#");
        LinkedHashSet.add("C");
        LinkedHashSet.add("php");

        System.out.println("Các phần tử trong LinkedHashSet: ");
        System.out.println(LinkedHashSet);

        String nameDelete = "C#";
        if (LinkedHashSet.contains(nameDelete)) {
            LinkedHashSet.remove(nameDelete);

            System.out.println("Các phần tử trong LinkedHashSet: ");
            System.out.println(LinkedHashSet);

        }
    }
}