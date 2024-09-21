class Persona {
    // ...
}

class Alumne extends Persona {
    Alumne(){
        // ...
    }
    // ...
}


public class A {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        Alumne alumne = new Alumne(){

        };

        imprimirJerarquiaDeClasses(alumne.getClass());
    }
}