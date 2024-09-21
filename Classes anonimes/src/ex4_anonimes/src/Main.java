import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface Alerta {
    String getMissatge();

    default int getMinuts() {
        return 0;
    }

    int getSegons();
}

class Temporitzador {
    List<Thread> threadList = new ArrayList<>();

    Temporitzador programar(Alerta alerta) {
        threadList.add(Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(alerta.getSegons() * 1000);
            } catch (Exception _) {
            }
            System.out.println("¡ALERTA! " + alerta.getMissatge());
        }));

        return this;
    }

    public void esperarQueAcabenLesAlertes() throws InterruptedException {
        for (Thread thread : threadList) thread.join();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado= new Scanner(System.in);

        Temporitzador temp=new Temporitzador();
        while (true){
            String mensaje;
            int tiempo;

            System.out.println("Pon mensaje");
            mensaje=teclado.nextLine();
            System.out.println("Pon tiempo");
            tiempo=teclado.nextInt();
            teclado.nextLine();

            temp.programar(new Alerta() {
                        @Override
                        public String getMissatge() {
                            return mensaje;
                        }

                        @Override
                        public int getSegons() {
                            return tiempo;
                        }
                    });
        }




    }
}