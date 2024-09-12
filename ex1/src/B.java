interface Mariner{
    void carrec();
}


public class B {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        Mariner JackSparrow = new Mariner(){
            @Override
            public void carrec(){
                System.out.println("Es capità");
            };
        };

        imprimirJerarquiaDeClasses(JackSparrow.getClass());
    }
}