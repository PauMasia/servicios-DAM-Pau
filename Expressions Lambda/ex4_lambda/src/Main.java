import java.util.List;
import java.util.logging.Filter;

class mostradorDeAlumnos {
    void mostrar(List<Estudiante> estudiantes, Filtre filtro) {
        for (Estudiante e : estudiantes) {
            if (filtro.filtrar(e)) {
                System.out.print("\n" + e.nombre + ": " + e.nota);
            }
        }
    }
}

interface Filtre {
    boolean filtrar(Estudiante e);
}

public class Main {

    public static void main(String[] args) {

/*
        Con nota superior o igual a 5
        Cuyo nombre contenga la letra C
        Cuyo nombre tenga más de cinco letras
        Todos los alumnos (sin filtro)
*/
        List<Estudiante> estudiantes = List.of(
                new Estudiante("Alvaro", 2),
                new Estudiante("Mario", 6),
                new Estudiante("Pedro", 9),
                new Estudiante("Darius", 5),
                new Estudiante("Carlos", 5)
        );

        mostradorDeAlumnos mostradorDeAlumnos = new mostradorDeAlumnos();
        System.out.println("\nMas de un 4");

        mostradorDeAlumnos.mostrar(estudiantes, e -> {
            if (e.nota > 4) {
                return true;
            } else {
                return false;
            }
        });
        System.out.println("\nContiene la C");

        mostradorDeAlumnos.mostrar(estudiantes, i -> {
            boolean devolver=false;
            for (char a : i.nombre.toCharArray()) {
                if (a=='c'||a=='C') {
                     devolver= true;
                }
            }
            return devolver;
        });
        System.out.println("\nMas de 5 letras");
        mostradorDeAlumnos.mostrar(estudiantes,o-> o.nombre.length()>5); //damn bro
        System.out.println("\nTodos");

        mostradorDeAlumnos.mostrar(estudiantes, u -> true);
    }
}

class Estudiante {
    public String nombre;
    public int nota;

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}