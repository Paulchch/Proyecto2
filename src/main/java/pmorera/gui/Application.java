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

        //Labels, JRadioButton, JComboBox ; constructor: texto que lo acompaña


        JLabel id_l = new JLabel("Id:");
        id_l.setBounds(20,10,40,30);//see later
        gui.add(id_l);



        JLabel nombre_l = new JLabel("Nombre:");
        nombre_l.setBounds(20,60,60,30);
        gui.add(nombre_l);

        JLabel sexo_l = new JLabel("Sexo");
        sexo_l.setBounds(20,95,60,30 );
        gui.add(sexo_l);

        JLabel estado_civil_l = new JLabel("Estado Civil");
        estado_civil_l.setBounds(20, 130,80,30);
        gui.add(estado_civil_l);

//composite used*
        //text fields
        JTextField id_t = new JTextField("");
        id_t.setBounds(60,10,150,30);
        gui.add(id_t);

        JTextField nombre_t = new JTextField("");
        nombre_t.setBounds(75,60,150,30);
        gui.add(nombre_t);

        //Radio Buttons
        JRadioButton masculino_r = new JRadioButton("Masculino");
        masculino_r.setBounds(90,95,100,30);
        gui.add(masculino_r);

        JRadioButton femenino_r = new JRadioButton("Femenino");
        femenino_r.setBounds(200,95,100,30);
        gui.add(femenino_r);

        //JComboBox<String> estado = new JComboBox<> (new String[] {"Soltero", "Casado"});

        JComboBox <String> estado_civil_c = new JComboBox<>(new String[] {"Soltero", "Casado"});
        estado_civil_c.setBounds(100, 130,80,30);
        gui.add(estado_civil_c);

        JButton guardar_b = new JButton("Guardar");
        guardar_b.setBounds(100,200,100,30);
        guardar_b.setBackground(Color.GREEN);
        gui.add(guardar_b);

        //esto va hasta el final
        gui.setVisible(true);

        System.out.println("Main terminal");

        //las clases heredan de container
    }
}
