import javax.swing.*;
import java.awt.*;

public class MarcoUsuario extends JFrame {

    public MarcoUsuario() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ventana de Usuario");
        setVisible(true);
    }

    public void centrarMarco() {
        Toolkit miPantallaCentrada = Toolkit.getDefaultToolkit();
        Dimension tamanyoPantalla = miPantallaCentrada.getScreenSize();
        int alturaPantalla = tamanyoPantalla.height;
        int anchoPantalla = tamanyoPantalla.width;
        setSize(anchoPantalla / 2, alturaPantalla / 2);
        setLocation(anchoPantalla / 4, alturaPantalla / 4);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PanelUsuario miPanel = new PanelUsuario();
        MarcoUsuario miMarco = new MarcoUsuario();
        miMarco.add(miPanel);
        //miMarco.centrarMarco();
        miMarco.pack();


    }

}
