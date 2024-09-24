import java.util.List;

interface Filtre {
    boolean filtrar(int numero);
}


class MostradorDeNumeros {
    void mostrar(List<Integer> numeros, Filtre filtre) {
        for (var numero : numeros) {
            if (filtre.filtrar(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        var numeros = List.of(2, 6, 4, 8, 1, 9, 3, 7, 5);

        MostradorDeNumeros mostradorDeNumeros = new MostradorDeNumeros();
        mostradorDeNumeros.mostrar(numeros, numero -> numero > 4);
//versio mes curta posible

        mostradorDeNumeros.mostrar(numeros, (Filtre) numero -> {
            if (numero % 2 == 0) {
                return true;
            } else {
                return false;
            }
        });
        mostradorDeNumeros.mostrar(numeros, (Filtre) numero -> {
            if (numero % 3 == 0) {
                return true;
            } else {
                return false;
            }
        });
    }
}