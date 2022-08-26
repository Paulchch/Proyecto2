package pmorera.gui;
//(main)
//para ventanas
import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World :) !!");
        //Ventana
        JFrame gui = new JFrame("HelloWorld!!");
        gui.setSize(400,200);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        gui.setLayout(null);

        JLabel id_l = new JLabel("Id:");
        id_l.setBounds(20,10,40,30);//see later
        gui.add(id_l);
//composite
        JTextField id_t = new JTextField("");
        id_t.setBounds(60,10,150,30);
        gui.add(id_t);
        //save

        JButton guardar_b = new JButton("Guardar");
        guardar_b.setBounds(60,90,100,30);
        guardar_b.setBackground(Color.GREEN);
        gui.add(guardar_b);

        //esto va hasta el final
        gui.setVisible(true);

        System.out.println("Main terminal");


    }
}
