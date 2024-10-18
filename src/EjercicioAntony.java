import java.util.ArrayList;
import java.util.List;

public class EjercicioAntony {


    public static void main(String[] args) {

        Integer edad = 32;

        String nombre = "antony";
        String nombre1 = "fredy";
        String nombre2 = "juan";

        List<String> listAlumnos = new ArrayList<>();

        //Agregar elementos
        listAlumnos.add(nombre);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);


        System.out.println(listAlumnos);

        //Cantidad de  elementos

        System.out.println(listAlumnos.size());
        //Extraer un valor del array

        System.out.println(listAlumnos.getFirst());

        System.out.println(listAlumnos.get(1));

        System.out.println(listAlumnos.getLast());


        //Remover

        listAlumnos.remove(2);
        System.out.println(listAlumnos);

        System.out.println("Nueva eliminacion");
        listAlumnos.removeFirst();
        listAlumnos.removeLast();

    }
}
