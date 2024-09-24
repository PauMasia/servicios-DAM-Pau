import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {

        JButton button1 = new JButton("Mega Button1");
        button1.setBounds(0,0, 400,200);
        button1.addActionListener(e-> System.out.println("S'ha polsat el botó Mega Button1"));
        add(button1);

        JButton button2 = new JButton("Mega Button2");
        button2.setBounds(0,200, 400,200);
        ActionListener accion2= e -> System.out.println("S'ha polsat el botó Mega Button2");
        button2.addActionListener(accion2);
        add(button2);

        JButton button3 = new JButton("Mega Button3");
        button3.setBounds(0,400, 400,200);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("S'ha polsat el botó Mega Button3");
            }
        });
        add(button3);

        setSize(600, 200);
        setLayout(new GridLayout(1, 3));
        setVisible(true);
    }
}