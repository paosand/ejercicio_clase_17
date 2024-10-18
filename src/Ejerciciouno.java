import java.util.ArrayList;

public class Ejerciciouno {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Tamaño de la lista: " + fruits.size());
        System.out.println("Elementos de la lista: " + fruits);

        fruits.remove("Banana");


        int index = fruits.indexOf("Cherry");
        if (index != -1) {
            fruits.set(index, "Orange");
        }
        System.out.println("Lista resultante: " + fruits);
    }
}
