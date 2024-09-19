public class Main {

    abstract class HolaMon {
        private String frase;

        public abstract void setFrase();

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public void ferSalutacio() {


    }

    public static void main(String... args) {
        Main myApp = new Main();
        myApp.ferSalutacio();
    }
}