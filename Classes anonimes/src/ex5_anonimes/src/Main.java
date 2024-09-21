public class Main {

    abstract class HolaMon {
        private String frase;

        public abstract void setFrase();

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public  class HolaMonAngles extends HolaMon{
        private String frase;
        @Override
        public void setFrase(){
            frase="Hello World";
        };

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }
    public class HolaMonEspañol extends HolaMon{
        private String frase;
        @Override
        public void setFrase(){
            frase="Hola mon";
        };

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public  void ferSalutacio() {

        HolaMonAngles hello= new HolaMonAngles();
        hello.saludar();

        HolaMon salut= new HolaMon() {
            private String frase; //important si no, posa null
            @Override
            public void setFrase() {
                 frase = "Salut a tot le monde";
            }

            @Override
            public void saludar() {
                setFrase();
                System.out.println(this.frase);
            }
        };
        salut.saludar();

        HolaMonEspañol hola= new HolaMonEspañol();
        hola.saludar();

    }

    public static void main(String... args) {
        Main myApp = new Main();
        myApp.ferSalutacio();


    }
}