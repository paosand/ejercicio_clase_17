import java.util.ArrayList;

public class Ejerciciocinco {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        Integer[] numbersArray = new Integer[numbers.size()];
        numbersArray = numbers.toArray(numbersArray);
        System.out.println("imprime el contenido del array:");
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }
}