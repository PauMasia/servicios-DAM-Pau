import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        JButton button1 = new JButton("Mega Button1");
        button1.setBounds(0,0, 400,200);
        button1.addActionListener(new MyAction());
        add(button1);

        JButton button2 = new JButton("Mega Button2");
        button2.setBounds(0,200, 400,200);
        ActionListener accion2= e -> System.out.println("Boton 2 pulsado");
        add(button2);

        JButton button3 = new JButton("Mega Button3");
        button3.setBounds(0,400, 400,200);
        button3.addActionListener(e -> System.out.println("Accion, creada al vuelo "));
        add(button3);

        setSize(400,600);
        setLayout(null);
        setVisible(true);

    }
    class MyAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Mi accion");
        }


    }
}