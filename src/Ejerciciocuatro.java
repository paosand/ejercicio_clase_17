import java.util.ArrayList;
import java.util.List;

public class Ejerciciocuatro {
    public static void main(String[] args) {
        String nombre1 = "Apple";
        String nombre2 = "Banana";
        String nombre3 = "Cherry";
        String nombre4 = "Date";
        String nombre5 = "Banana";
        String nombre6 = "Date";
        String nombre7 = "Elderberry";
        String nombre8 = "fig";

        List<String> List1 = new ArrayList<>();
        List<String> List2 = new ArrayList<>();

        List1.add(nombre1);
        List1.add(nombre2);
        List1.add(nombre3);
        List1.add(nombre4);
        List2.add(nombre5);
        List2.add(nombre6);
        List2.add(nombre7);
        List2.add(nombre8);

        List<String> commonElements = new ArrayList<>();
        for (String a : List1) {
            if (List2.contains(a)) {
                commonElements.add(a);
            }
        }
        System.out.println(commonElements);
    }
}