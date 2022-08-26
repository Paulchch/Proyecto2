package pmorera.gui;
//(main)
//para ventanas
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World :) !!");
        //Ventana
        JFrame gui = new JFrame("HelloWorld!!");
        gui.setSize(400,200);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        System.out.println("Main terminal");
        //hola
    }
}
